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

public class MaterialFragment extends Fragment {

    private RecyclerView rvMainColor, rvColor;
    private ColorAdapter colorAdapter;
    private List<Color> colorList, nameList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_material, container, false);
        init(view);
        return view;
    }

    private void init(View view){
        rvMainColor = view.findViewById(R.id.recyclerView_main);
        rvColor = view.findViewById(R.id.recyclerView_color);
        colorList = Utils.toModelColor(ColorCode.colorRed);
        nameList = Utils.toModelColor(ColorCode.colorMain);
        colorAdapter = new ColorAdapter(getContext(), null);

        rvColor.setAdapter(colorAdapter);
        rvMainColor.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        rvColor.setLayoutManager(new GridLayoutManager(getContext(), 2, LinearLayoutManager.VERTICAL, false));

        rvMainColor.setAdapter(new MainAdapter(getContext(), nameList, new InterfaceSelectColor() {
            @Override
            public void selectColor(int i) {
                setData(Utils.toModelColor(ColorCode.getC(i)));
            }
        }));
        setData(colorList);
    }

    private void setData(List<Color> colorList) {
        colorAdapter.setData(colorList);
    }
}
