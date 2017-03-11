package com.example.myfirstapp.data;

import android.provider.BaseColumns;
/**
 * Created by lauraid on 11/3/17.
 */

public class EsquemaBebe {
    public static abstract class bebeEntry implements BaseColumns {
        public static final String TABLE_NAME ="bebe";

        public static final String CEDULA = "cedula";
        public static final String NOMBRE = "nombre";
        public static final String APELLIDOS = "apellidos";
        public static final String FECHA_NAC = "fecha_nac";
        public static final String LUGAR_NAC = "lugar_nac";
        public static final String SEXO = "sexo";
        public static final String NACIONALIDAD = "nacionalidad";
        public static final String DIRECCION = "direccion";
        public static final String DEPARTAMENTO = "departamento";
        public static final String MUNICIPIO = "municipio";
        public static final String CEDULA_TUTOR = "cedula_tutor";
        public static final String TELEFONO = "telefono";
        public static final String SEGURO_MEDICO = "seguro_medico";
        public static final String ALERGIAS = "alergias";

    }
}

