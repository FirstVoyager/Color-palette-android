package limitless.materialcolor.Activity;

import androidx.appcompat.app.AppCompatActivity;
import limitless.materialcolor.Other.Constant;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;
import limitless.materialcolor.databinding.ActivityLiveColorBinding;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.SeekBar;

import java.util.Random;

/**
 * Live color activity
 * Created by love
 */
public class LiveColorActivity extends BaseActivity implements View.OnClickListener {

    private ActivityLiveColorBinding binding;
    /**
     * Delay time for change background
     */
    private int delayTime = 100;
    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int red = new Random().nextInt(255);
            int green = new Random().nextInt(255);
            int blue = new Random().nextInt(255);
            String color = "#" + Utils.toHexCode(red, green, blue);
            binding.imageView.setBackgroundColor(Utils.parseColor(color));
            handler.postDelayed(this, delayTime);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLiveColorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    @Override
    protected void onDestroy() {
        // remove runnable
        handler.removeCallbacks(runnable);
        super.onDestroy();
    }

    private void init() {
        binding.cardViewSpeed.setOnClickListener(null);
        binding.cardViewToolbar.setOnClickListener(null);
        binding.imageView.setOnClickListener(this);
        binding.seekBar.setMax(Constant.max_live_color_delay);
        binding.seekBar.setProgress(delayTime);
        binding.textViewMilliSecond.setText(getString(R.string.speed_s, delayTime));
        binding.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    delayTime = progress;
                    binding.textViewMilliSecond.setText(getString(R.string.speed_s, delayTime));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        binding.imageButtonBack.setOnClickListener(this);
        handler.postDelayed(runnable, delayTime);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButton_back) {
            finish();
        }else if (v.getId() == R.id.imageView) {
            alphaAnimation(binding.cardViewToolbar.getVisibility() != View.VISIBLE);
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
                    binding.cardViewSpeed.setVisibility(View.VISIBLE);
                    binding.cardViewToolbar.setVisibility(View.VISIBLE);
                }else {
                    binding.cardViewSpeed.setVisibility(View.INVISIBLE);
                    binding.cardViewToolbar.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        binding.cardViewToolbar.startAnimation(an);
        binding.cardViewSpeed.startAnimation(an);
    }

}