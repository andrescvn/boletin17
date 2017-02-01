/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Ejercicio2 {

    Alumno alumnos[] = new Alumno[2];
    int notas[] = new int[alumnos.length];

    public String pedirNombre() {
        return JOptionPane.showInputDialog("nombre");
    }

    public int pedirNota() {
        return Integer.parseInt(JOptionPane.showInputDialog("nota"));
    }

    public void cargarArray() {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno(notas[i] = pedirNota(), pedirNombre());
        }

    }

    public void aprobadosSuspensos() {
        int aprobados = 0;
        int suspensos = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] < 5) {
                suspensos++;
            } else {
                aprobados++;
            }
        }
        System.out.println("Aprobados =" + aprobados + "\nSuspensos=" + suspensos);
    }

    public void visualizarMedia() {
        int media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
        }
        System.out.println("Media=" + media / notas.length);
    }

    public void notaMayor() {

            }       

    public void visualizarAlumnosAprobados() {
        for(int i=0;i<alumnos.length;i++)
        if(notas[i]>=5)
        System.out.println((alumnos[i]));
    }

}
