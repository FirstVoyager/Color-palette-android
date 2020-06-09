package limitless.materialcolor.Fragment;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;
import limitless.materialcolor.Adapter.GradientAdapter;
import limitless.materialcolor.Model.Gradient;
import limitless.materialcolor.Other.ColorCode;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;

public class GradientFragment extends Fragment {

    private RecyclerView recyclerView;
    private GradientAdapter gradientAdapter;
    private List<Gradient> gradientList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gradient, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
        gradientAdapter = new GradientAdapter(getContext(), null);

        recyclerView.setAdapter(gradientAdapter);
        try {
            gradientList = Utils.getGradientColors(ColorCode.getGradientColor());
            setData(gradientList);
        } catch (JSONException e) {
            Utils.error(e);
        }
    }

    private void initSearchView(MenuItem item) {
        SearchView sv = (SearchView) item.getActionView();
        sv.setQueryHint("Enter Color Name Or Code");
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                s = s.toUpperCase();
                List<Gradient> newG = new ArrayList<>();
                for (int i = 0; i < gradientList.size(); i++) {
                    Gradient gc = gradientList.get(i);
                    if (
                            gc.geteCode().toUpperCase().contains(s) ||
                                    gc.getsCode().toUpperCase().contains(s) ||
                                    gc.getName().toUpperCase().contains(s)){
                        newG.add(gc);
                    }
                }
                setData(newG);
                return false;
            }
        });
        sv.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                setData(gradientList);
                return false;
            }
        });

    }

    private void setData(List<Gradient> gc) {
        gradientAdapter.setData(gc);
    }

}
