package inge2.inge2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by BlackLotusPy on 25/3/2017.
 */

public class DBHandler extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "vacunas.db";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        context.deleteDatabase(DATABASE_NAME);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE tutor ("
                + "ci TEXT NOT NULL PRIMARY KEY,"
                + "nombre TEXT NOT NULL,"
                + "apellido TEXT NOT NULL,"
                + "fechanac TEXT NOT NULL,"
                + "lugarnac TEXT NOT NULL,"
                + "googleid TEXT NOT NULL);"
        );
        db.execSQL("CREATE TABLE hijo ("
                + "ci TEXT NOT NULL PRIMARY KEY,"
                + "nombre TEXT NOT NULL,"
                + "apellido TEXT NOT NULL,"
                + "fechanac TEXT NOT NULL,"
                + "lugarnac TEXT NOT NULL,"
                + "sexo TEXT NOT NULL,"
                + "nacionalidad TEXT NOT NULL,"
                + "direccion TEXT NOT NULL,"
                + "departamento TEXT NOT NULL,"
                + "municipio TEXT NOT NULL,"
                + "barrio TEXT NOT NULL,"
                + "referencia TEXT NOT NULL,"
                + "ci_tutor TEXT NOT NULL,"
                + "telefono TEXT NOT NULL,"
                + "seguro TEXT NOT NULL,"
                + "alergia TEXT NOT NULL);"

        );
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }





}
