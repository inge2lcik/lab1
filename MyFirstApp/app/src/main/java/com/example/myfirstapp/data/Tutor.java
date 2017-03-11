package com.example.myfirstapp.data;

import android.content.ContentValues;

/**
 * Created by lauraid on 10/3/17.
 */

public class Tutor {

        private String nombre;
        private String apellidos;
        private String fecha_nac;
        private String lugar_nac;
        private String cedula;
        private String id_google;

        public Tutor(String cedula, String nombre,
                      String apellidos, String fecha_nac,
                      String lugar_nac,String id_google) {
            this.cedula = cedula;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fecha_nac = fecha_nac;
            this.lugar_nac = lugar_nac;
            this.id_google= id_google;
        }

        public String getCedula() {
            return cedula;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public String getFecha_nac() {
            return fecha_nac;
        }

        public String getLugar_nac() {
            return lugar_nac;
        }

        public String getId_google() {
            return id_google;
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(EsquemaTutor.tutorEntry.CEDULA, cedula);
        values.put(EsquemaTutor.tutorEntry.NOMBRE, nombre);
        values.put(EsquemaTutor.tutorEntry.APELLIDOS, apellidos);
        values.put(EsquemaTutor.tutorEntry.FECHA_NAC, fecha_nac);
        values.put(EsquemaTutor.tutorEntry.LUGAR_NAC, lugar_nac);
        values.put(EsquemaTutor.tutorEntry.ID_GOOGLE, id_google);
        return values;
    }


}
