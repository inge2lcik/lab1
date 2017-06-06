package inge2.inge2;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class pag_principal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        NotificationCompat.Builder mBuilder =new NotificationCompat.Builder(this);
        mBuilder.setSmallIcon(android.R.drawable.ic_delete);
        mBuilder.setContentTitle("Inge2");
        mBuilder.setContentText("Vacunacion necesaria!");
        mBuilder.build();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        vaciarTabla_tutor();
        vaciarTabla_hijo();
        poblarTabla_tutor();
        poblarTabla_hijo();

        Intent intent = getIntent();
        String ID_GOOGLE = intent.getStringExtra(MainActivity.ID_GOOGLE);
        TextView textView = new TextView(this);
        textView.setTextSize(20);

        String USERNAME=obtener_nombre_tutor(ID_GOOGLE);
        String msj="Bienvenido/a "+USERNAME+"!";
        textView.setText(msj);

        String CI=obtener_ci_tutor(ID_GOOGLE);

        ArrayList<String> HIJOS=obtener_hijos(CI);

        ListView list=new ListView(this);
        list.setDivider(new ColorDrawable(Color.BLUE));
        list.setDividerHeight(3);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, HIJOS);
        list.setAdapter(adaptador);
        list.setBackground(new ColorDrawable(Color.rgb(179, 204, 255)));
        list.setY(120);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Ha pulsado el item " + position, Toast.LENGTH_SHORT).show();

            }

        });


        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
        layout.addView(list);

    }



    private void vaciarTabla_tutor() {
        DBHandler helperVacunas = new DBHandler(this);
        SQLiteDatabase bd = helperVacunas.getWritableDatabase();
        bd.execSQL("delete from tutor;");
        bd.close();
    }
    private void vaciarTabla_hijo() {
        DBHandler helperVacunas = new DBHandler(this);
        SQLiteDatabase bd = helperVacunas.getWritableDatabase();
        bd.execSQL("delete from hijo;");
        bd.close();
    }


    private void poblarTabla_tutor() {
        DBHandler helperVacunas = new DBHandler(this);
        SQLiteDatabase bd = helperVacunas.getWritableDatabase();
        ContentValues registro = new ContentValues();
        registro.put("ci", "4689742");
        registro.put("nombre", "Miguel Angel David");
        registro.put("apellido", "Recalde Carballo");
        registro.put("fechanac", "04/10/1990");
        registro.put("lugarnac", "Asunción");
        registro.put("googleid", "114173331628776727983");
        bd.insert("tutor", null, registro);
        bd.close();
    }
    private void poblarTabla_hijo() {
        DBHandler helperVacunas = new DBHandler(this);
        SQLiteDatabase bd = helperVacunas.getWritableDatabase();
        ContentValues registro = new ContentValues();
        registro.put("ci", "1");
        registro.put("nombre", "Cristina");
        registro.put("apellido", "Recalde");
        registro.put("fechanac", "04/10/2020");
        registro.put("lugarnac", "Asunción");
        registro.put("sexo", "Femenino");
        registro.put("nacionalidad", "Parauaya");
        registro.put("direccion", "San Lorenzo 1225");
        registro.put("departamento", "Central");
        registro.put("municipio", "Asunción");
        registro.put("barrio", "San José");
        registro.put("referencia", "Extintores parana");
        registro.put("ci_tutor", "4689742");
        registro.put("telefono", "123456");
        registro.put("seguro", "La Costa");
        registro.put("alergia", "Ninguna");
        bd.insert("hijo", null, registro);
        registro = new ContentValues();
        registro.put("ci", "2");
        registro.put("nombre", "Leonardo");
        registro.put("apellido", "Recalde");
        registro.put("fechanac", "04/10/2022");
        registro.put("lugarnac", "Asunción");
        registro.put("sexo", "Masculino");
        registro.put("nacionalidad", "Parauaya");
        registro.put("direccion", "San Lorenzo 1225");
        registro.put("departamento", "Central");
        registro.put("municipio", "Asunción");
        registro.put("barrio", "San José");
        registro.put("referencia", "Extintores parana");
        registro.put("ci_tutor", "4689742");
        registro.put("telefono", "123456");
        registro.put("seguro", "La Costa");
        registro.put("alergia", "Ninguna");
        bd.insert("hijo", null, registro);
        registro = new ContentValues();
        registro.put("ci", "3");
        registro.put("nombre", "Raul");
        registro.put("apellido", "Gonzalez");
        registro.put("fechanac", "04/10/2020");
        registro.put("lugarnac", "Asunción");
        registro.put("sexo", "Masculino");
        registro.put("nacionalidad", "Parauaya");
        registro.put("direccion", "San Lorenzo 1225");
        registro.put("departamento", "Central");
        registro.put("municipio", "Asunción");
        registro.put("barrio", "San José");
        registro.put("referencia", "Extintores parana");
        registro.put("ci_tutor", "5454651");
        registro.put("telefono", "123456");
        registro.put("seguro", "La Costa");
        registro.put("alergia", "Ninguna");
        bd.insert("hijo", null, registro);
        bd.close();
    }

    private String obtener_nombre_tutor(String googleid) {
        DBHandler helperVacunas = new DBHandler(this);
        SQLiteDatabase bd = helperVacunas.getWritableDatabase();
        String msj= "Usuario no registrado";
        Cursor fila = bd.rawQuery(
                "select nombre, apellido from tutor;", null);
        if (fila.moveToFirst()) {
            msj= fila.getString(0) + " " + fila.getString(1);
        }else{
            msj= msj+googleid;
        }
        fila.close();
        bd.close();
        return msj;
    }
    private String obtener_ci_tutor(String googleid) {
        DBHandler helperVacunas = new DBHandler(this);
        SQLiteDatabase bd = helperVacunas.getWritableDatabase();
        String msj= "Sin CI";
        Cursor fila = bd.rawQuery(
                "select ci from tutor where googleid='" + googleid+"';", null);
        if (fila.moveToFirst()) {
            msj= fila.getString(0);
        }else{
            msj= msj+googleid;
        }
        fila.close();
        bd.close();
        return msj;
    }

    private ArrayList<String> obtener_hijos(String ci) {
        DBHandler helperVacunas = new DBHandler(this);
        SQLiteDatabase bd = helperVacunas.getWritableDatabase();
        ArrayList<String> msj= new ArrayList<>();
        Cursor fila = bd.rawQuery(
                "select nombre, apellido from hijo where ci_tutor='" + ci+"';", null);

        for(fila.moveToFirst(); !fila.isAfterLast(); fila.moveToNext()) {
                msj.add(fila.getString(0)+" "+fila.getString(1));
        }
        fila.close();
        bd.close();
        return msj;



    }




}
