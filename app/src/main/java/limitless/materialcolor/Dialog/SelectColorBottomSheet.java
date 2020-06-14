package limitless.materialcolor.Dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSeekBar;
import limitless.materialcolor.Interface.Listener;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;
import limitless.materialcolor.databinding.BottomSheetSelectColorBinding;

public class SelectColorBottomSheet extends BottomSheetDialogFragment implements View.OnClickListener {

    private BottomSheetSelectColorBinding binding;
    private String currentColorHex = null, currentColorRGBA;
    private Integer[] colors;
    private Listener<Integer[]> colorListener;

    private AppCompatSeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
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
    };

    public SelectColorBottomSheet(@Nullable Integer[] colors) {
        if (colors == null)
            colors = new Integer[]{255, 135, 0, 255};
        this.colors = colors;
    }

    public void setColorListener(Listener<Integer[]> colorListener) {
        this.colorListener = colorListener;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BottomSheetDialogFragment.STYLE_NORMAL, R.style.BottomSheet_Transparent);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = BottomSheetSelectColorBinding.inflate(inflater, container, false);
        getDialog().setContentView(binding.getRoot());
        init();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private void init() {
        binding.seekBarRed.setOnSeekBarChangeListener(seekBarChangeListener);
        binding.seekBarGreen.setOnSeekBarChangeListener(seekBarChangeListener);
        binding.seekBarBlue.setOnSeekBarChangeListener(seekBarChangeListener);
        binding.seekBarAlpha.setOnSeekBarChangeListener(seekBarChangeListener);
        binding.seekBarRed.setProgress(colors[0]);
        binding.seekBarGreen.setProgress(colors[1]);
        binding.seekBarBlue.setProgress(colors[2]);
        binding.seekBarAlpha.setProgress(colors[3]);
        binding.textViewRgb.setOnClickListener(this);
        binding.textViewHex.setOnClickListener(this);
    }

    private void setData() {
        int red = binding.seekBarRed.getProgress();
        int green = binding.seekBarGreen.getProgress();
        int blue = binding.seekBarBlue.getProgress();
        int alpha = binding.seekBarAlpha.getProgress();
        currentColorRGBA = "RGB (" + red + ", " + green + ", " + blue + ", " + alpha + ")";
        currentColorHex = Utils.toHexCode(red, green, blue, alpha);

        binding.textViewRgb.setText(currentColorRGBA);
        binding.textViewHex.setText("HEX " + currentColorHex.toUpperCase());
        binding.viewColor.setBackgroundColor(Utils.parseColor(currentColorHex));

        if (colorListener != null)
            colorListener.data(new Integer[]{red, green, blue, alpha});
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView_rgb:
                Utils.copyToClipboard(getContext(), currentColorRGBA);
                Utils.toast(getContext(), currentColorRGBA + " " + getString(R.string.copied));
                break;
            case R.id.textView_hex:
                Utils.copyToClipboard(getContext(), currentColorHex);
                Utils.toast(getContext(), currentColorHex + " " + getString(R.string.copied));
                break;
        }
    }

}
