package limitless.materialcolor.Other;

import android.Manifest;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.provider.MediaStore;

import androidx.annotation.IntegerRes;
import androidx.annotation.StringRes;
import androidx.core.app.ActivityCompat;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.textview.MaterialTextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.FragmentTransaction;
import limitless.materialcolor.BuildConfig;
import limitless.materialcolor.Fragment.FavoriteFragment;
import limitless.materialcolor.Model.Color;
import limitless.materialcolor.Model.Gradient;
import limitless.materialcolor.R;

public class Utils {

    private static Toast toast;

    /**
     * Share your message text
     * @param context
     * @param s Message for share
     */
    public static void shareText(Context context, String s) {
        if (context == null || s == null || s.isEmpty())
            return;
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, s);
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.url_app)));
    }

    /**
     * Share text with res id
     * @param context
     * @param id for res id
     */
    public static void shareText(Context context, @StringRes int id) {
        if (context == null)
            return;
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, context.getString(id));
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.url_app)));
    }

    public static Drawable roundDrawable(String code) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setShape(GradientDrawable.OVAL);
        drawable.setColor(android.graphics.Color.parseColor(code));
        return drawable;
    }

    public static List<Color> toModelColor(String[][] main) {
        List<Color> colorList = new ArrayList<>();
        for (String[] aMain : main) {
            Color mc = new Color();
            for (int j = 0; j < 2; j++) {
                mc.setName(aMain[0]);
                mc.setCode(aMain[1]);
            }
            colorList.add(mc);
        }
        return colorList;
    }

    public static void copyToClipboard(Context context, String s) {
        if (context == null || s == null)
            return;
        ClipboardManager manager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText(null, s);
        if (manager != null)
            manager.setPrimaryClip(clipData);
    }

    /**
     * Show custom toast with res id
     * @param context
     * @param id id for string resouces
     */
    public static void customToast(Context context, @StringRes int id){
        customToast(context, context.getString(id));
    }

    /**
     * Show custom toast with check if show cancel it
     * @param context
     * @param s message for show
     */
    public static void customToast(Context context, String s) {
        if (context == null || s == null || s.isEmpty())
            return;
        if (toast != null)
            toast.cancel();
        toast = new Toast(context);
        View view = View.inflate(context, R.layout.custom_toast, null);
        ((MaterialTextView) view.findViewById(R.id.textView)).setText(s);
        toast.setView(view);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    public static String toHexCode(int red, int green, int blue) {
        float[] hsv = new float[3];
        android.graphics.Color.RGBToHSV(red, green, blue, hsv);
        int color = android.graphics.Color.HSVToColor(hsv);
        return String.format("%06X", (0xFFFFFF & color));
    }

    public static String toHexCode(@IntegerRes int red, @IntegerRes int green, @IntegerRes int blue, int alpha) {
        float[] hsv = new float[3];
        android.graphics.Color.RGBToHSV(red, green, blue, hsv);
        int color = android.graphics.Color.HSVToColor(alpha, hsv);
        return String.format("#%08X", color);
    }

    public static List<Gradient> getGradientColors(JSONArray array){
        List<Gradient> gradients = new ArrayList<>();
        JSONObject jo;
        for (int i = 0; i < array.length(); i++) {
            try {
                jo = array.getJSONObject(i);
                JSONArray ja = jo.getJSONArray("colors");
                gradients.add(
                        new Gradient(jo.getString("name"), ja.getString(0), ja.getString(ja.length() - 1))
                );
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return gradients;
    }

    public static Drawable getGradientDrawble(String s, String e) {
        GradientDrawable gd = null;
        try {
            gd = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                    new int[]{
                            android.graphics.Color.parseColor(s),
                            android.graphics.Color.parseColor(e)});
            gd.setShape(GradientDrawable.RECTANGLE);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return gd;
    }

    public static boolean premissionCamera(Activity activity) {
        return ActivityCompat.checkSelfPermission(activity, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED;
    }

    public static void requestPermissionCamera(Activity activity) {
        ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.CAMERA}, Constant.permissionCamera);
    }

    public static void capImage(Activity activity) {
        Intent intent = new Intent();
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        activity.startActivityForResult(intent, Constant.imageCapture);
    }

    /**
     * @param context
     * @param url a url want to open
     */
    public static void openUrl(Context context, String url) {
        if (context == null || url == null)
            return;
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(context, intent);
    }

    public static void openEmail(Context context, String email, String subject, String text) {
        if (context == null || email == null)
            return;
        Intent intent = new Intent();
        intent.setData(Uri.fromParts("mailto", email, null));
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        startActivity(context, intent);
    }

    public static void log(int n) {
        if (BuildConfig.DEBUG)
            Log.i("Material_log", String.valueOf(n));
    }

    public static void error(Exception e) {
        if (e != null && BuildConfig.DEBUG)
            e.printStackTrace();
    }

    public static int parseColor(String code) {
        try {
            return android.graphics.Color.parseColor(code);
        }catch (Exception e){
            error(e);
            try {
                return Integer.parseInt(code);
            }catch (Exception e1){
                error(e1);
                return android.graphics.Color.WHITE;
            }
        }
    }

    public static void commit(FragmentTransaction ft) {
        if (ft == null)
            return;
        try {
            ft.commit();
        } catch (Exception e) {
            error(e);
        }
    }

    public static void startActivity(Context context, Class<?> aClass) {
        if (context == null || aClass == null)
            return;
        startActivity(context, new Intent(context, aClass));
    }

    public static void startActivity(Context context, Intent intent){
        if (context == null || intent == null)
            return;
        try {
            context.startActivity(intent);
        }catch (Exception e){
            error(e);
        }
    }

    public static void sendAddFavBroadCast(Context context, String code) {
        if (context == null || code == null || code.isEmpty())
            return;
        Intent intent = new Intent(FavoriteFragment.ACTION_ADD_FAVORITE);
        intent.putExtra(Intent.EXTRA_TEXT, code);
        context.sendBroadcast(intent);
    }

    public static void sendDeleteFavBroadCast(Context context, String code) {
        if (context == null || code == null ||code.isEmpty())
            return;
        Intent intent = new Intent(FavoriteFragment.ACTION_DELETE_FAVORITE);
        intent.putExtra(Intent.EXTRA_TEXT, code);
        context.sendBroadcast(intent);
    }

    public static AdRequest adRequest() {
        AdRequest.Builder builder = new AdRequest.Builder();
        return builder.build();
    }

    public static void showStartInterstitialAd(final Context context) {
        if (new SharePref(context).get(SharePref.ShowStartAd, true)){
            new SharePref(context).put(SharePref.ShowStartAd, false);
            return;
        }
        final InterstitialAd ad = new InterstitialAd(context);
        ad.setAdUnitId(context.getString(R.string.ad_interstitial));
        ad.loadAd(Utils.adRequest());
        ad.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                ad.show();
                new SharePref(context).put(SharePref.ShowStartAd, true);
            }
        });
    }


    public static void setScaleAnimation(View view) {
        ScaleAnimation anim = new ScaleAnimation(
                0.0f, 1.0f, 0.0f,
                1.0f, Animation.RELATIVE_TO_SELF,
                0.5f, Animation
                .RELATIVE_TO_SELF,
                0.5f);
        anim.setDuration(150);
        view.startAnimation(anim);
    }


}
