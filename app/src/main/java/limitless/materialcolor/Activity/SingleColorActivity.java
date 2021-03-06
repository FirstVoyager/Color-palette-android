package limitless.materialcolor.Activity;

import androidx.annotation.NonNull;
import limitless.materialcolor.Other.SQLiteFavorite;
import limitless.materialcolor.Other.SharePref;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;
import limitless.materialcolor.databinding.ActivitySingleColorBinding;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.SeekBar;

import java.io.File;
import java.io.FileOutputStream;

public class SingleColorActivity extends BaseActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {

    /**
     * Code to check permission request result
     */
    private static final int storage_permission_code = 1001;

    private ActivitySingleColorBinding binding;
    private SQLiteFavorite sqLiteFavorite;
    private String currentColorHex = null, currentColorRGBA;
    private SharePref sharePref;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySingleColorBinding.inflate(getLayoutInflater());
        init();
        setContentView(binding.getRoot());
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == storage_permission_code && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            saveColor();
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    private void init() {
        sqLiteFavorite = new SQLiteFavorite(this);
        sharePref = new SharePref(this);

        binding.seekBarRed.setOnSeekBarChangeListener(this);
        binding.seekBarGreen.setOnSeekBarChangeListener(this);
        binding.seekBarBlue.setOnSeekBarChangeListener(this);
        binding.seekBarAlpha.setOnSeekBarChangeListener(this);
        binding.seekBarRed.setProgress(sharePref.get(SharePref.ColorRed, 0));
        binding.seekBarGreen.setProgress(sharePref.get(SharePref.ColorGreen, 100));
        binding.seekBarBlue.setProgress(sharePref.get(SharePref.ColorBlue, 255));
        binding.seekBarAlpha.setProgress(sharePref.get(SharePref.ColorAlpha, 255));
        binding.textViewRgb.setOnClickListener(this);
        binding.textViewHex.setOnClickListener(this);
        binding.imageButtonFavorite.setOnClickListener(this);
        binding.imageButtonBack.setOnClickListener(this);
        binding.viewColor.setOnClickListener(this);
        binding.cardViewToolbar.setOnClickListener(null);
        binding.cardViewColors.setOnClickListener(null);
        binding.imageButtonSave.setOnClickListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        setData();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    private void setData() {
        int red = binding.seekBarRed.getProgress();
        int green = binding.seekBarGreen.getProgress();
        int blue = binding.seekBarBlue.getProgress();
        int alpha = binding.seekBarAlpha.getProgress();
        currentColorRGBA = "RGB (" + red + ", " + green + ", " + blue + ", " + alpha + ")";
        currentColorHex = Utils.toHexCode(red, green, blue, alpha);

        sharePref.put(SharePref.ColorRed, red);
        sharePref.put(SharePref.ColorGreen, green);
        sharePref.put(SharePref.ColorBlue, blue);
        sharePref.put(SharePref.ColorAlpha, alpha);
        binding.textViewRgb.setText(currentColorRGBA);
        binding.textViewHex.setText("HEX " + currentColorHex.toUpperCase());
        binding.viewColor.setBackgroundColor(Color.parseColor(currentColorHex));
        if (sqLiteFavorite.existColor(currentColorHex)){
            binding.imageButtonFavorite.setImageResource(R.drawable.ic_favorite_black_24dp);
        }else {
            binding.imageButtonFavorite.setImageResource(R.drawable.ic_favorite_border_black_24dp);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.view_color:
                alphaAnimation(binding.cardViewColors.getVisibility() != View.VISIBLE);
                break;
            case R.id.imageButton_back:
                finish();
                break;
            case R.id.textView_rgb:
                Utils.copyToClipboard(this, currentColorRGBA);
                Utils.toast(this, currentColorRGBA + " " + getString(R.string.copied));
                break;
            case R.id.textView_hex:
                Utils.copyToClipboard(this, currentColorHex);
                Utils.toast(this, currentColorHex + " " + getString(R.string.copied));
                break;
            case R.id.imageButton_favorite:
                addToFavorite();
                break;
            case R.id.imageButton_save:
                saveColor();
                break;
        }
    }

    /**
     * Save color as file
     */
    private void saveColor() {
        if (Utils.checkPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)) { // save color
            File file = Utils.bitmapToFile(this, Utils.colorToBitmap(Color.parseColor(currentColorHex)));
            if (file != null && file.exists()) { // save and share image
                Utils.sendPhoto(this, file);
            } else {
                Utils.toast(this, R.string.error);
            }
        }else { // request read and write permission
            Utils.requestPermission(this, storage_permission_code, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE);
        }
    }

    private void alphaAnimation(boolean show) {
        AlphaAnimation an = new AlphaAnimation(show ? 0 : 1, show ? 1 : 0);
        an.setDuration(100);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (show){
                    binding.cardViewColors.setVisibility(View.VISIBLE);
                    binding.cardViewToolbar.setVisibility(View.VISIBLE);
                }else {
                    binding.cardViewColors.setVisibility(View.INVISIBLE);
                    binding.cardViewToolbar.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        binding.cardViewColors.startAnimation(an);
        binding.cardViewToolbar.startAnimation(an);
    }

    private void addToFavorite() {
        if (currentColorHex == null)
            return;
        if (sqLiteFavorite.existColor(currentColorHex)){
            sqLiteFavorite.deleteColor(currentColorHex);
            binding.imageButtonFavorite.setImageResource(R.drawable.ic_favorite_border_black_24dp);
            Utils.toast(this, R.string.delete_from_favorite);
            Utils.sendDeleteFavBroadCast(this, currentColorHex);
        }else {
            sqLiteFavorite.putColor(currentColorHex);
            binding.imageButtonFavorite.setImageResource(R.drawable.ic_favorite_black_24dp);
            Utils.toast(this, R.string.add_to_favorite);
            Utils.sendAddFavBroadCast(this, currentColorHex);
        }
    }

}