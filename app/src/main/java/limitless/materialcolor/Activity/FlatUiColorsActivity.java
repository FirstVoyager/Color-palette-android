package limitless.materialcolor.Activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;

import limitless.materialcolor.Adapter.ColorAdapter;
import limitless.materialcolor.Other.ColorCode;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;

public class FlatUiColorsActivity extends AppCompatActivity {

    private RecyclerView rvFUC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_ui_colors);
        init();
    }

    private void init() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rvFUC = findViewById(R.id.recyclerView_flatUiColors_activityFlatUiColors);
        rvFUC.setLayoutManager(new GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false));
        rvFUC.setAdapter(new ColorAdapter(this, Utils.toModelColor(ColorCode.colorFlatUI)));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
