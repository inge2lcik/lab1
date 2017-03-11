package com.example.myfirstapp.data;

import android.provider.BaseColumns;

/**
 * Created by lauraid on 10/3/17.
 */

public class EsquemaTutor {
    public static abstract class tutorEntry implements BaseColumns {
        public static final String TABLE_NAME ="tutor";

        public static final String CEDULA = "cedula";
        public static final String NOMBRE = "nombre";
        public static final String APELLIDOS = "apellidos";
        public static final String FECHA_NAC = "fecha_nac";
        public static final String LUGAR_NAC = "lugar_nac";
        public static final String ID_GOOGLE = "id_google";
    }
}
