package limitless.materialcolor.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import limitless.materialcolor.Activity.GradientColorActivity;
import limitless.materialcolor.Activity.LiveColorActivity;
import limitless.materialcolor.Activity.SingleColorActivity;
import limitless.materialcolor.Model.Gradient;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;
import limitless.materialcolor.databinding.FragmentNewBinding;

public class NewFragment extends Fragment {

    private FragmentNewBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNewBinding.inflate(inflater, container, false);
        binding.cardViewSingleColor.setOnClickListener(v -> Utils.startActivity(getContext(), SingleColorActivity.class));
        binding.cardViewGradientColor.setOnClickListener(v -> Utils.startActivity(getContext(), GradientColorActivity.class));
        binding.cardViewLiveColor.setOnClickListener(v -> Utils.startActivity(getContext(), LiveColorActivity.class));
        return binding.getRoot();
    }

}