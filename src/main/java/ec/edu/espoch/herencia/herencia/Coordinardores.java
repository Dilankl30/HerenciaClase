/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herencia.herencia;

/**
 *
 * @author USUARIO
 */
public class Coordinardores extends Personas {
    
    private String Id;
    private String titulo;
    private String cargo;

    public Coordinardores(String Id, String titulo, String cargo, String Nombre, String Apellido, String Cedula, String genero, int edad) {
        super(Nombre, Apellido, Cedula, genero, edad);
        this.Id = Id;
        this.titulo = titulo;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString()+"Coordinardores{" + "Id=" + Id + ", titulo=" + titulo + ", cargo=" + cargo + '}';
    }
    
    
}
