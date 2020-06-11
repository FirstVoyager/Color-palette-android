package limitless.materialcolor.Activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.palette.graphics.Palette;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.MenuItem;
import android.view.View;

import com.mattyork.colours.Colour;

import limitless.materialcolor.Other.Constant;
import limitless.materialcolor.Other.Utils;
import limitless.materialcolor.R;

public class ColorImageActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatImageView ivMain;
    private AppCompatButton btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    private int c1, c2, c3, c4, c5, c6, c7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_image);
        init();

    }


    private void init() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.button_gallery_activityColorImage).setOnClickListener(this);
        findViewById(R.id.button_camera_activityColorImage).setOnClickListener(this);
        ivMain = findViewById(R.id.imageView_main_colorImage_activityColorImage);
        setData(((BitmapDrawable) ivMain.getDrawable()).getBitmap(), null);
        btn1 = findViewById(R.id.button_1_activityColorImage);
        btn2 = findViewById(R.id.button_2_activityColorImage);
        btn3 = findViewById(R.id.button_3_activityColorImage);
        btn4 = findViewById(R.id.button_4_activityColorImage);
        btn5 = findViewById(R.id.button_5_activityColorImage);
        btn6 = findViewById(R.id.button_6_activityColorImage);
        btn7 = findViewById(R.id.button_7_activityColorImage);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_camera_activityColorImage:
                getCamera();
                break;
            case R.id.button_gallery_activityColorImage:
                getGallery();
                break;
            case R.id.button_1_activityColorImage:
                copyCode(c1);
                break;
            case R.id.button_2_activityColorImage:
                copyCode(c2);
                break;
            case R.id.button_3_activityColorImage:
                copyCode(c3);
                break;
            case R.id.button_4_activityColorImage:
                copyCode(c4);
                break;
            case R.id.button_5_activityColorImage:
                copyCode(c5);
                break;
            case R.id.button_6_activityColorImage:
                copyCode(c6);
                break;
            case R.id.button_7_activityColorImage:
                copyCode(c7);
                break;
        }
    }

    private void copyCode(int s) {
        Utils.copyToClipboard(this, String.valueOf(s));
        Utils.customToast(this, String.valueOf(s) + " Copied");
    }

    private void getGallery() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent, Constant.imageGallery);
    }

    private void getCamera() {
        if (Utils.premissionCamera(this)){
            Utils.requestPermissionCamera(this);
        }else {
            capImage();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == Constant.permissionCamera){
            if (resultCode == Activity.RESULT_OK){
                capImage();
            }
        }else if (requestCode == Constant.imageCapture){
            if (resultCode == Activity.RESULT_OK){
                setData((Bitmap) data.getExtras().get("data"), null);
            }
        }else if (requestCode == Constant.imageGallery){
            if (resultCode == Activity.RESULT_OK){
                setData(null, data.getData());
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void setData(Bitmap bitmap, Uri uri) {
        if (bitmap == null){
            ivMain.setImageURI(uri);
        }else {
            ivMain.setImageBitmap(bitmap);
        }
        Palette.from(((BitmapDrawable) ivMain.getDrawable()).getBitmap()).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(@Nullable Palette palette) {
                int def = Color.parseColor("#ffffff");
                c1 = palette.getDarkMutedColor(def);
                setColor(btn1, c1);
                c2 = palette.getDarkVibrantColor(def);
                setColor(btn2, c2);
                c3 = palette.getDominantColor(def);
                setColor(btn3, c3);
                c4 = palette.getMutedColor(def);
                setColor(btn4, c4);
                c5 = palette.getVibrantColor(def);
                setColor(btn5, c5);
                c6 = palette.getLightMutedColor(def);
                setColor(btn6, c6);
                c7 = palette.getLightVibrantColor(def);
                setColor(btn7, c7);
            }
        });
    }

    private void setColor(AppCompatButton button, int color) {
        if (color == -1){
            button.setVisibility(View.GONE);
        }else {
            button.setVisibility(View.VISIBLE);
            button.setBackgroundColor(color);
        }
    }

    private void capImage() {
        Utils.capImage(this);
    }

}
