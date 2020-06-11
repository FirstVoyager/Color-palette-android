package limitless.materialcolor.Fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import limitless.materialcolor.Other.SQLiteFavorite;
import limitless.materialcolor.Other.SharePref;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;

public class SingleColorFragment extends Fragment implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    private AppCompatSeekBar sbRed, sbGreen, sbBlue, sbAlpha;
    private AppCompatTextView tvRGB, tvHEX;
    private View vColor;
    private AppCompatImageButton btnFavorite;
    private SQLiteFavorite sqLiteFavorite;
    private String currentColorHex = null, currentColorRGBA;
    private SharePref sharePref;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new, container, false);
        init(view);
        return view;
    }

    private void init(View v) {
        vColor = v.findViewById(R.id.view_color);
        tvRGB = v.findViewById(R.id.textView_rgb);
        tvHEX = v.findViewById(R.id.textView_hex);
        sbRed = v.findViewById(R.id.seekBar_red);
        sbGreen = v.findViewById(R.id.seekBar_green);
        sbBlue = v.findViewById(R.id.seekBar_blue);
        sbAlpha = v.findViewById(R.id.seekBar_alpha);
        btnFavorite = v.findViewById(R.id.imageButton_favorite);
        sqLiteFavorite = new SQLiteFavorite(getContext());
        sharePref = new SharePref(getContext());

        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
        sbAlpha.setOnSeekBarChangeListener(this);
        sbRed.setProgress(sharePref.get(SharePref.ColorRed, 0));
        sbGreen.setProgress(sharePref.get(SharePref.ColorGreen, 100));
        sbBlue.setProgress(sharePref.get(SharePref.ColorBlue, 255));
        sbAlpha.setProgress(sharePref.get(SharePref.ColorAlpha, 255));
        tvRGB.setOnClickListener(this);
        tvHEX.setOnClickListener(this);
        btnFavorite.setOnClickListener(this);
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
        int red = sbRed.getProgress();
        int green = sbGreen.getProgress();
        int blue = sbBlue.getProgress();
        int alpha = sbAlpha.getProgress();
        currentColorRGBA = "RGB (" + red + ", " + green + ", " + blue + ", " + alpha + ")";
        currentColorHex = Utils.toHexCode(red, green, blue, alpha);

        sharePref.put(SharePref.ColorRed, red);
        sharePref.put(SharePref.ColorGreen, green);
        sharePref.put(SharePref.ColorBlue, blue);
        sharePref.put(SharePref.ColorAlpha, alpha);
        tvRGB.setText(currentColorRGBA);
        tvHEX.setText("HEX " + currentColorHex.toUpperCase());
        vColor.setBackgroundColor(Color.parseColor(currentColorHex));
        if (sqLiteFavorite.existColor(currentColorHex)){
            btnFavorite.setImageResource(R.drawable.ic_favorite_black_24dp);
        }else {
            btnFavorite.setImageResource(R.drawable.ic_favorite_border_black_24dp);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView_rgb:
                copyRGB();
                break;
            case R.id.textView_hex:
                copyHEX();
                break;
            case R.id.imageButton_favorite:
                addToFavorite();
                break;
        }
    }

    private void addToFavorite() {
        if (currentColorHex == null)
            return;
        if (sqLiteFavorite.existColor(currentColorHex)){
            sqLiteFavorite.deleteColor(currentColorHex);
            btnFavorite.setImageResource(R.drawable.ic_favorite_border_black_24dp);
            Utils.customToast(getContext(), R.string.delete_from_favorite);
            Utils.sendDeleteFavBroadCast(getContext(), currentColorHex);
        }else {
            sqLiteFavorite.putColor(currentColorHex);
            btnFavorite.setImageResource(R.drawable.ic_favorite_black_24dp);
            Utils.customToast(getContext(), R.string.add_to_favorite);
            Utils.sendAddFavBroadCast(getContext(), currentColorHex);
        }
    }

    private void copyHEX() {
        Utils.copyToClipboard(getContext(), currentColorHex);
        Utils.customToast(getContext(), currentColorHex + " " + getString(R.string.copied));
    }

    private void copyRGB() {
        Utils.copyToClipboard(getContext(), currentColorRGBA);
        Utils.customToast(getContext(), currentColorRGBA + " " + getString(R.string.copied));
    }

}
