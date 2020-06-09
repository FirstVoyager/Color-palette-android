package limitless.materialcolor.Other;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import limitless.materialcolor.Model.Color;

public class SQLiteFavorite extends SQLiteOpenHelper {

    private static final String name = "sqlite.main";
    private static final int version = 1;
    private SQLiteDatabase database;

    private String fCode = "CREATE TABLE favorite (id INTEGER PRIMARY KEY AUTOINCREMENT, INCREAMENT, color TEXT );";

    public SQLiteFavorite(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(fCode);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void read(){
        database = getReadableDatabase();
    }

    private void write(){
        database = getWritableDatabase();
    }

    public boolean existColor(String color){
        if (color == null || color.isEmpty())
            return false;
        read();
        color = "'" + color + "'";
        Cursor cursor = database.rawQuery("SELECT * FROM favorite WHERE color=" + color, null);
        if (cursor == null)
            return false;
        if (cursor.getCount() <= 0) {
            cursor.close();
            return false;
        }
        cursor.close();
        return true;
    }

    public boolean putColor(String color){
        if (color == null || color.isEmpty())
            return false;
        write();
        ContentValues cv = new ContentValues();
        cv.put("color", color);
        return database.insert("favorite", null, cv) > 0;
    }

    public boolean deleteColor(String color){
        if (color == null || color.isEmpty())
            return false;
        write();
        return database.delete("favorite", "color=?", new String[]{color}) > 0;
    }

    public List<Color> getFavorites(){
        read();
        Cursor cursor = database.rawQuery("SELECT * FROM favorite ORDER BY id DESC;", null);
        if (cursor == null)
            return null;
        if (cursor.getCount() <= 0 || ! cursor.moveToFirst()){
            cursor.close();
            return null;
        }
        List<Color> list = new ArrayList<>();
        cursor.moveToFirst();
        int color = cursor.getColumnIndex("color");
        do {
            list.add(new Color(null, cursor.getString(color)));
        }while (cursor.moveToNext());
        cursor.close();
        return list;
    }

}
