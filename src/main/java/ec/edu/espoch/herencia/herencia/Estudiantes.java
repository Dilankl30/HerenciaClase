/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herencia.herencia;

/**
 *
 * @author USUARIO
 */
public class Estudiantes extends Personas {

    private String codigo;

    public Estudiantes(String codigo, String Nombre, String Apellido, String Cedula, String genero, int edad) {
        super(Nombre, Apellido, Cedula, genero, edad);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiantes{" + "codigo=" + codigo + '}';
    }

}
