package limitless.materialcolor.Fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import limitless.materialcolor.Adapter.ColorAdapter;
import limitless.materialcolor.Model.Color;
import limitless.materialcolor.Other.SQLiteFavorite;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;

public class FavoriteFragment extends Fragment {

    public static final String ACTION_ADD_FAVORITE = "ACTION_ADD_FAVORITE";
    public static final String ACTION_DELETE_FAVORITE = "ACTION_DELETE_FAVORITE";

    private SQLiteFavorite favorite;
    private RecyclerView recyclerView;
    private ColorAdapter colorAdapter;
    private View vFavorite;
    private List<Color> colorList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        favorite = new SQLiteFavorite(getContext());
        recyclerView = view.findViewById(R.id.recyclerView);
        colorAdapter = new ColorAdapter(getContext(), null, true);
        vFavorite = view.findViewById(R.id.view_favorite);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(colorAdapter);
        colorList = favorite.getFavorites();
        if (colorList != null){
            vFavorite.setVisibility(View.GONE);
            colorAdapter.setData(colorList);
        }
        IntentFilter filter = new IntentFilter();
        filter.addAction(ACTION_ADD_FAVORITE);
        getContext().registerReceiver(addReceiver, filter);
        filter = new IntentFilter();
        filter.addAction(ACTION_DELETE_FAVORITE);
        getContext().registerReceiver(deleteReceiver, filter);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        try {
            getContext().unregisterReceiver(addReceiver);
            getContext().unregisterReceiver(deleteReceiver);
        }catch (Exception e){
            Utils.error(e);
        }
    }

    private BroadcastReceiver deleteReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(ACTION_DELETE_FAVORITE)){
                colorAdapter.deleteItem(intent.getStringExtra(Intent.EXTRA_TEXT));
                if (colorAdapter.getItemCount() <= 0)
                    vFavorite.setVisibility(View.VISIBLE);
            }
        }
    };
    private BroadcastReceiver addReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(ACTION_ADD_FAVORITE)){
                colorAdapter.putItem(intent.getStringExtra(Intent.EXTRA_TEXT));
                if (vFavorite.getVisibility() == View.VISIBLE)
                    vFavorite.setVisibility(View.GONE);
            }
        }
    };

}
