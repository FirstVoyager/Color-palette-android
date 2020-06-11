package limitless.materialcolor.Activity;

import android.graphics.Color;
import android.os.Bundle;

import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.ads.AdView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;

import limitless.materialcolor.Dialog.SourceCodeDialog;
import limitless.materialcolor.Fragment.FavoriteFragment;
import limitless.materialcolor.Fragment.GradientFragment;
import limitless.materialcolor.Fragment.MaterialFragment;
import limitless.materialcolor.Fragment.SingleColorFragment;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;
import nl.psdcompany.duonavigationdrawer.views.DuoDrawerLayout;
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bnv;
    private DuoDrawerLayout drawer;
    private MaterialFragment materialFragment;
    private GradientFragment gradientFragment;
    private SingleColorFragment singleColorFragment;
    private FavoriteFragment favoriteFragment;
    private int lastId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        // load banner ads
        AdView adView = findViewById(R.id.adView);
        adView.loadAd(Utils.adRequest());
        // load interstitial ads
        Utils.showStartInterstitialAd(this);
    }

    private void init() {
        materialFragment = new MaterialFragment();
        gradientFragment = new GradientFragment();
        singleColorFragment = new SingleColorFragment();
        favoriteFragment = new FavoriteFragment();
        drawer =  findViewById(R.id.drawer_layout);
        bnv = findViewById(R.id.bnv);

        bnv.setOnNavigationItemSelectedListener(this);
        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        initToolbar();
        setFragment(materialFragment, R.id.nav_material);
        setTitle(R.string.material_color);
    }

    private void initToolbar() {
        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DuoDrawerToggle drawerToggle = new DuoDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawer.setDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem item = menu.add(R.string.source_code);
        item.setIcon(R.drawable.github);
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        DrawableCompat.setTint(item.getIcon(), Color.WHITE);
        menu.add(R.string.share);
        menu.add(R.string.rate_us);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getTitle() != null && item.getTitle().equals(getString(R.string.source_code))){
            new SourceCodeDialog().show(getSupportFragmentManager(), null);
        }else if (item.getTitle() != null && item.getTitle().equals(getString(R.string.share))){
            Utils.shareText(this, R.string.url_app);
        }else if (item.getTitle() != null && item.getTitle().equals(getString(R.string.rate_us))){
            Utils.openUrl(this, getString(R.string.url_app));
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        drawer.closeDrawer(GravityCompat.START);
        int id = item.getItemId();
        switch (id){
            case R.id.nav_from_image:
                Utils.startActivity(this, ColorImageActivity.class);
                break;
            case R.id.nav_top_color:
                Utils.startActivity(this, TopColorsActivity.class);
                break;
            case R.id.nav_flat_ui_colors:
                Utils.startActivity(this, FlatUiColorsActivity.class);
                break;
            case R.id.nav_social:
                Utils.startActivity(this, SocialActivity.class);
                break;
            case R.id.nav_metro:
                Utils.startActivity(this, MetroColorsActivity.class);
                break;
            case R.id.nav_fluent:
                Utils.startActivity(this, FluentColorsActivity.class);
                break;
            case R.id.nav_material:
                setFragment(materialFragment, id);
                lastId = id;
                setTitle(R.string.material_color);
                break;
            case R.id.nav_gradiend:
                setFragment(gradientFragment, id);
                lastId = id;
                setTitle(R.string.gradient_color);
                break;
            case R.id.nav_new:
                setFragment(singleColorFragment, id);
                lastId = id;
                setTitle(R.string.new_color);
                break;
            case R.id.nav_favorite:
                setFragment(favoriteFragment, id);
                lastId = id;
                setTitle(R.string.favorite_color);
                break;
        }
        return true;
    }

    private void setFragment(Fragment f, int id) {
        if (lastId == id)
            return;
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if (f.isAdded())
            ft.show(f);
        else
            ft.add(R.id.fragmentContainer, f);
        Utils.commit(ft);
        ft = getSupportFragmentManager().beginTransaction();
        switch (lastId){
            case R.id.nav_material:
                ft.hide(materialFragment);
                break;
            case R.id.nav_gradiend:
                ft.hide(gradientFragment);
                break;
            case R.id.nav_new:
                ft.hide(singleColorFragment);
                break;
            case R.id.nav_favorite:
                ft.hide(favoriteFragment);
                break;
        }
        Utils.commit(ft);
    }

}
