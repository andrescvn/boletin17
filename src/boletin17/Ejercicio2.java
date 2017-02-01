/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Ejercicio2 {

    private Alumno alumnos[] = new Alumno[2];
    private int notas[] = new int[alumnos.length];

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
        int max = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        System.out.println("Nota mas alta= " + max);
    }

    public void visualizarAlumnosAprobados() {
        for (int i = 0; i < alumnos.length; i++) {
            if (notas[i] >= 5) {
                System.out.println((alumnos[i]));
            }
        }
    }

    public void ordenar() {
        Arrays.sort(notas);
        System.out.println("Lista de notas:");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(notas[i]);
        }
    }

    public void buscar() {
        Alumno al = new Alumno(0, pedirNombre());
        int aux = 1;
        for (int i = 0; i < alumnos.length; i++) {
            aux = al.compareTo(alumnos[i]);
            if (aux == 0) {
                System.out.println(alumnos[i]);
            }
        }
        if (aux == 1) {
            System.out.println("no existe");
        }

    }
}
