/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.herencia;

import ec.edu.espoch.herencia.herencia.Coordinardores;
import ec.edu.espoch.herencia.herencia.Estudiantes;
import ec.edu.espoch.herencia.herencia.Profesores;

/**
 *
 * @author USUARIO
 */
public class HERENCIA {

    public static void main(String[] args) {
        Estudiantes objEstudiantes = new Estudiantes("254", "Dilan", "Lucero", "2250044001", "Masculino", 20);
        System.out.println(objEstudiantes.toString());

        Profesores obProfe = new Profesores("5482", "UN genio", "Pedro", "Aguilar", "65465", "Masculino", 15);
        System.out.println(obProfe);

        Coordinardores objCoor = new Coordinardores("5241", "HOLA", "Coordinador", "Paguay", "Pafuay", "25412", "Masculino", 50);
        System.out.println(objCoor);

    }
}
