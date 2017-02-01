/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author acomesanavila
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Numeros nu = new Numeros();
        nu.cargarArray();
        nu.visualizar();
        System.out.println("**");
        nu.visualizarAlreves();*/
        
        Ejercicio2 al=new Ejercicio2 ();
        al.cargarArray();
        al.visualizarAlumnosAprobados();
        al.aprobadosSuspensos();
        al.notaMayor();
        al.visualizarMedia();
        System.out.println("*****");
        al.ordenar();
        System.out.println("****");
        al.buscar();

    }

}
