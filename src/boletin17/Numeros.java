/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author acomesanavila
 */
public class Numeros {

    private Integer[] numeros = new Integer[6];

    public void cargarArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.floor(Math.random() * (50 - 1)) + 1);

        }
    }

    public void visualizar() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

    public void visualizarAlreves() {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
}
