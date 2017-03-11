package com.example.myfirstapp.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lauraid on 10/3/17.
 */

public class vacunasDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "vacunas.db";

    public vacunasDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + EsquemaTutor.tutorEntry.TABLE_NAME + " ("
                + EsquemaTutor.tutorEntry.CEDULA + " TEXT PRIMARY KEY UNIQUE,"
                + EsquemaTutor.tutorEntry.NOMBRE + " TEXT NOT NULL,"
                + EsquemaTutor.tutorEntry.APELLIDOS + " TEXT NOT NULL,"
                + EsquemaTutor.tutorEntry.FECHA_NAC + " TEXT NOT NULL,"
                + EsquemaTutor.tutorEntry.ID_GOOGLE + " TEXT NOT NULL,"
                + EsquemaTutor.tutorEntry.LUGAR_NAC + " TEXT NOT NULL)");
        db.execSQL("CREATE TABLE " + EsquemaBebe.bebeEntry.TABLE_NAME + " ("
                + EsquemaBebe.bebeEntry.CEDULA + " TEXT PRIMARY KEY UNIQUE,"
                + EsquemaBebe.bebeEntry.NOMBRE + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.APELLIDOS + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.FECHA_NAC + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.LUGAR_NAC + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.SEXO + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.NACIONALIDAD + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.DIRECCION + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.DEPARTAMENTO + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.MUNICIPIO + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.CEDULA_TUTOR + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.TELEFONO + " TEXT NOT NULL,"
                + EsquemaBebe.bebeEntry.SEGURO_MEDICO + " TEXT NOT NULL)");

        llenarDatos(db);

    }

    private void llenarDatos(SQLiteDatabase sqLiteDatabase) {
        // POBLAR BASE DE DATOS DE TUTORES
        llenarTutor(sqLiteDatabase, new Tutor("3918689", "Laura", "Id", "02/02/1991", "Asunción.","100685483996697077757"));
        llenarTutor(sqLiteDatabase, new Tutor("4689742", "Miguel Angel", "Recalde", "04/10/1990", "Asuncion.","0"));
        llenarTutor(sqLiteDatabase, new Tutor("3918681", "Mara", "Barrios", "04/02/1991", "Asunción.","0"));
        llenarTutor(sqLiteDatabase, new Tutor("3918682", "Belén", "Molinas", "05/02/1991", "Lambaré.","0"));
        llenarTutor(sqLiteDatabase, new Tutor("3918683", "Rodrigo", "Benitez", "06/02/1991", "Luque.","0"));
        // POBLAR BASE DE DATOS DE BEBES
        llenarBebe(sqLiteDatabase, new Bebe("1", "Rodrigo", "Benitez", "06/02/1991", "Luque.",
                                            "Masculino","Paraguayo","Independecia Nacional","Central",
                                            "Asunción","3918683","123456","La Costa","Ninguna"));



    }

    public long llenarTutor(SQLiteDatabase db, Tutor tutor) {
        return db.insert(
                EsquemaTutor.tutorEntry.TABLE_NAME,
                null,
                tutor.toContentValues());
    }

    public long llenarBebe(SQLiteDatabase db, Bebe bebe) {
        return db.insert(
                EsquemaBebe.bebeEntry.TABLE_NAME,
                null,
                bebe.toContentValues());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public long saveTutor(Tutor vtutor) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        return sqLiteDatabase.insert(
                EsquemaTutor.tutorEntry.TABLE_NAME,
                null,
                vtutor.toContentValues());
    }

    public long saveBebe(Bebe vbebe) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        return sqLiteDatabase.insert(
                EsquemaBebe.bebeEntry.TABLE_NAME,
                null,
                vbebe.toContentValues());
    }

    public String checkear_id(String id){
        String query="Select (id_google=?) from tutor";
        Cursor c = getReadableDatabase().rawQuery(query,new String[]{id});
        String resultado="false";
        //while(c.moveToNext()){
        //    resultado = c.getString(c.getColumnIndex(EsquemaTutor.tutorEntry.ID_GOOGLE));
        //}


        return resultado;
    }


}
