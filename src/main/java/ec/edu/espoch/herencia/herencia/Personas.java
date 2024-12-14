/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herencia.herencia;

/**
 *
 * @author USUARIO
 */
public class Personas {

    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String genero;
    private int edad;

    public Personas(String Nombre, String Apellido, String Cedula, String genero, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Cedula=" + Cedula + ", genero=" + genero + ", edad=" + edad + '}';
    }
    
}
