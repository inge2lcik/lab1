package com.example.myfirstapp.data;

import android.content.ContentValues;

/**
 * Created by lauraid on 11/3/17.
 */

public class Bebe {

    private String cedula;
    private String nombre;
    private String apellidos;
    private String fecha_nac;
    private String lugar_nac;
    private String sexo;
    private String nacionalidad;
    private String direccion;
    private String departamento;
    private String municipio;
    private String cedula_tutor;
    private String telefono;
    private String seguro_medico;
    private String alergias;

    public Bebe(String cedula,
                String nombre,
                String apellidos,
                String fecha_nac,
                String lugar_nac,
                String sexo,
                String nacionalidad,
                String direccion,
                String departamento,
                String municipio,
                String cedula_tutor,
                String telefono,
                String seguro_medico,
                String alergias
                ) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nac = fecha_nac;
        this.lugar_nac = lugar_nac;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.departamento = departamento;
        this.municipio = municipio;
        this.cedula_tutor = cedula_tutor;
        this.telefono = telefono;
        this.seguro_medico = seguro_medico;
        this.alergias = alergias;
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

    public String getSexo() {
        return sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getCedula_tutor() {
        return cedula_tutor;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getSeguro_medico() {
        return seguro_medico;
    }

    public String getAlergias() {
        return alergias;
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(EsquemaBebe.bebeEntry.CEDULA, cedula);
        values.put(EsquemaBebe.bebeEntry.NOMBRE, nombre);
        values.put(EsquemaBebe.bebeEntry.APELLIDOS, apellidos);
        values.put(EsquemaBebe.bebeEntry.FECHA_NAC, fecha_nac);
        values.put(EsquemaBebe.bebeEntry.LUGAR_NAC, lugar_nac);
        values.put(EsquemaBebe.bebeEntry.SEXO, sexo);
        values.put(EsquemaBebe.bebeEntry.NACIONALIDAD, nacionalidad);
        values.put(EsquemaBebe.bebeEntry.DIRECCION, direccion);
        values.put(EsquemaBebe.bebeEntry.DEPARTAMENTO, departamento);
        values.put(EsquemaBebe.bebeEntry.MUNICIPIO, municipio);
        values.put(EsquemaBebe.bebeEntry.CEDULA_TUTOR, cedula_tutor);
        values.put(EsquemaBebe.bebeEntry.TELEFONO, telefono);
        values.put(EsquemaBebe.bebeEntry.SEGURO_MEDICO, seguro_medico);
        return values;
    }

}
