/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herencia.herencia;

/**
 *
 * @author USUARIO
 */
public class Profesores extends Personas {

    private String Id;
    private String titulo;

    public Profesores(String Id, String titulo, String Nombre, String Apellido, String Cedula, String genero, int edad) {
        super(Nombre, Apellido, Cedula, genero, edad);
        this.Id = Id;
        this.titulo = titulo;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesores{" + "Id=" + Id + ", titulo=" + titulo + '}';
    }

}
