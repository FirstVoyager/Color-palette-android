package limitless.materialcolor.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import limitless.materialcolor.Adapter.ColorAdapter;
import limitless.materialcolor.Adapter.MainAdapter;
import limitless.materialcolor.Interface.InterfaceSelectColor;
import limitless.materialcolor.Model.Color;
import limitless.materialcolor.Other.ColorCode;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;
import limitless.materialcolor.databinding.FragmentMaterialBinding;

public class MaterialFragment extends Fragment {

    private FragmentMaterialBinding binding;
    private ColorAdapter colorAdapter;
    private List<Color> colorList, nameList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMaterialBinding.inflate(inflater, container, false);
        init();
        return binding.getRoot();
    }

    private void init(){
        colorList = Utils.toModelColor(ColorCode.colorRed);
        nameList = Utils.toModelColor(ColorCode.colorMain);
        colorAdapter = new ColorAdapter(getContext(), null);

        binding.recyclerViewColor.setAdapter(colorAdapter);
        binding.recyclerViewMain.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recyclerViewColor.setLayoutManager(new GridLayoutManager(getContext(), 2, LinearLayoutManager.VERTICAL, false));

        binding.recyclerViewMain.setAdapter(new MainAdapter(getContext(), nameList, i -> setData(Utils.toModelColor(ColorCode.getC(i)))));
        setData(colorList);
    }

    private void setData(List<Color> colorList) {
        colorAdapter.setData(colorList);
    }
}
