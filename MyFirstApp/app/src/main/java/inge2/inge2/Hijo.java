package inge2.inge2;

/**
 * Created by BlackLotusPy on 25/3/2017.
 */

public class Hijo {

    private String CI;
    private String Nombre;
    private String Apellido;
    private String FechaDeNac;
    private String LugarDeNac;

    private String Sexo;
    private String Nacionalidad;
    private String Direccion;
    private String Departamento;
    private String Municipio;

    private String Barrio;
    private String Referencia;
    private String CI_tutor;
    private String Telefono;
    private String Seguro;

    private String Alergia;




    public Hijo(String CI, String Nombre, String Apellido, String CI_tutor){
        this.CI=CI;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.CI_tutor=CI_tutor;
    }



    public String getCI() {
        return CI;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public String getFechaDeNac() {
        return FechaDeNac;
    }
    public String getLugarDeNac() {
        return LugarDeNac;
    }



    public String getSexo() {
        return Sexo;
    }
    public String getNacionalidad() {
        return Nacionalidad;
    }
    public String getDireccion() {
        return Direccion;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public String getMunicipio() {
        return Municipio;
    }



    public String getBarrio() {
        return Barrio;
    }
    public String getReferencia() {
        return Referencia;
    }
    public String getCI_tutor() {
        return CI_tutor;
    }
    public String getTelefono() {
        return Telefono;
    }
    public String getSeguro() {
        return Seguro;
    }



    public String getAlergia() {
        return Alergia;
    }
}
