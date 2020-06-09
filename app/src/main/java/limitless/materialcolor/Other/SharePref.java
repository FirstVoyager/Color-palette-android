package limitless.materialcolor.Other;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharePref {

    public static final String ShowStartAd = "ShowStartAd";
    public static final String FeedbackKey = "FeedbackKey";
    public static final String ColorRed = "ColorRed";
    public static final String ColorGreen = "ColorGreen";
    public static final String ColorBlue = "ColorBlue";
    public static final String ColorAlpha = "ColorAlpha";

    private SharedPreferences sp;
    private Editor editor;

    public SharePref(Context context) {
        sp = context.getSharedPreferences("sharepref.material", Context.MODE_PRIVATE);
    }

    @SuppressLint("CommitPrefEdits")
    private void setEditor(){
        editor = sp.edit();
    }

    public void put(String key, int value){
        setEditor();
        editor.putInt(key, value).commit();
    }

    public int get(String key, int def){
        return sp.getInt(key, def);
    }


    public void put(String key, boolean value){
        setEditor();
        editor.putBoolean(key, value).commit();
    }

    public boolean get(String key, boolean def){
        return sp.getBoolean(key, def);
    }

    public void put(String key, String value){
        setEditor();
        editor.putString(key, value).commit();
    }

    public String get(String key, String def){
        return sp.getString(key, def);
    }

}
