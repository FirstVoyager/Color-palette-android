package limitless.materialcolor.Activity;

import androidx.annotation.NonNull;
import limitless.materialcolor.Dialog.SelectColorBottomSheet;
import limitless.materialcolor.Interface.Listener;
import limitless.materialcolor.Other.SQLiteFavorite;
import limitless.materialcolor.Other.SharePref;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;
import limitless.materialcolor.databinding.ActivityGradientColorBinding;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class GradientColorActivity extends BaseActivity implements View.OnClickListener {

    private ActivityGradientColorBinding binding;
    private Integer[] colorStart = new Integer[]{255, 0, 0, 255};
    private Integer[] colorEnd = new Integer[]{0, 0, 255, 255};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGradientColorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }
    private void init() {
        binding.textViewRgbStart.setOnClickListener(this);
        binding.textViewRgbEnd.setOnClickListener(this);
        binding.textViewHexStart.setOnClickListener(this);
        binding.textViewHexEnd.setOnClickListener(this);
        binding.textViewStart.setOnClickListener(this);
        binding.textViewEnd.setOnClickListener(this);
        binding.imageView.setOnClickListener(this);
        binding.imageButtonBack.setOnClickListener(this);
        binding.cardViewToolbar.setOnClickListener(null);
        binding.linearLayoutColors.setOnClickListener(null);
        binding.imageView.setImageDrawable(Utils.gradientDrawable(Utils.toHexCode(colorStart), Utils.toHexCode(colorEnd)));
        setColors();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView:
                alphaAnimation(binding.cardViewToolbar.getVisibility() != View.VISIBLE);
                break;
            case R.id.imageButton_back:
                finish();
                break;
            case R.id.textView_start:
                selectColor(true);
                break;
            case R.id.textView_end:
                selectColor(false);
                break;
            case R.id.textView_rgbStart:
                Utils.copyToClipboard(this, rgb(true));
                Utils.toast(this, rgb(true) + " " + getString(R.string.copied));
                break;
            case R.id.textView_rgbEnd:
                Utils.copyToClipboard(this, rgb(false));
                Utils.toast(this, rgb(false) + " " + getString(R.string.copied));
                break;
            case R.id.textView_hexStart:
                Utils.copyToClipboard(this, Utils.toHexCode(colorStart));
                Utils.toast(this, Utils.toHexCode(colorStart) + " " + getString(R.string.copied));
                break;
            case R.id.textView_hexEnd:
                Utils.copyToClipboard(this, Utils.toHexCode(colorEnd));
                Utils.toast(this, Utils.toHexCode(colorEnd) + " " + getString(R.string.copied));
                break;
//            case R.id.imageButton_view:
//                Intent intent = new Intent(this, FullColorViewActivity.class);
//                intent.putExtra(FullColorViewActivity.COLOR_CODE, isStartColor ? startHex : endHex);
//                Utils.startActivity(this, intent);
//                break;
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
                    binding.linearLayoutColors.setVisibility(View.VISIBLE);
                    binding.cardViewToolbar.setVisibility(View.VISIBLE);
                }else {
                    binding.linearLayoutColors.setVisibility(View.INVISIBLE);
                    binding.cardViewToolbar.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        binding.cardViewToolbar.startAnimation(an);
        binding.linearLayoutColors.startAnimation(an);
    }

    private void selectColor(boolean start) {
        SelectColorBottomSheet sheet = new SelectColorBottomSheet(start ? colorStart : colorEnd);
        sheet.setColorListener(integers -> {
            if (start)
                colorStart = integers;
            else
                colorEnd = integers;
            binding.imageView.setImageDrawable(Utils.gradientDrawable(Utils.toHexCode(colorStart), Utils.toHexCode(colorEnd)));
            setColors();
        });
        Utils.showDialog(sheet, getSupportFragmentManager());
    }

    private void setColors() {
        binding.textViewRgbStart.setText(rgb(true));
        binding.textViewRgbEnd.setText(rgb(false));

        binding.textViewHexStart.setText(Utils.toHexCode(colorStart));
        binding.textViewHexEnd.setText(Utils.toHexCode(colorEnd));
    }

    private String rgb(boolean start) {
        if (start)
            return "(" + colorStart[0] + "," + colorStart[1] + "," + colorStart[2] + "," + colorStart[3] + ")";
        else
            return "(" + colorEnd[0] + "," + colorEnd[1] + "," + colorEnd[2] + "," + colorEnd[3] + ")";
    }

}