package inge2.inge2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by BlackLotusPy on 25/3/2017.
 */

public class vacunasDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "vacunas.db";

    public vacunasDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE tutor ("
                + "ci TEXT NOT NULL PRIMARY KEY,"
                + "nombre TEXT NOT NULL,"
                + "apellido TEXT NOT NULL,"
                + "fechanac TEXT NOT NULL,"
                + "lugarnac TEXT NOT NULL,"
                + "googleid TEXT NOT NULL);");



    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }





}
