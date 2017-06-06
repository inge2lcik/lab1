package inge2.inge2;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

public class pag_principal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        poblarTabla_tutor();


        Intent intent = getIntent();
        String ID_GOOGLE = intent.getStringExtra(MainActivity.ID_GOOGLE);
        TextView textView = new TextView(this);
        textView.setTextSize(20);

        String USERNAME=obtener_nombre_tutor(ID_GOOGLE);
        String msj="Bienvenido/a "+USERNAME+"!";
        textView.setText(msj);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }



    private void poblarTabla_tutor() {
        vacunasDbHelper helperVacunas = new vacunasDbHelper(this);
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

    private String obtener_nombre_tutor(String googleid) {
        vacunasDbHelper helperVacunas = new vacunasDbHelper(this);
        SQLiteDatabase bd = helperVacunas.getWritableDatabase();
        String msj= "Usuario no registrado";
        Cursor fila = bd.rawQuery(
                "select nombre, apellido from tutor where googleid='" + googleid+"';", null);
        if (fila.moveToFirst()) {
            msj= fila.getString(0) + " " + fila.getString(1);
        }else{
            msj= msj+googleid;
        }
        bd.close();
        return msj;
    }




}
