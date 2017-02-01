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
public class Alumno {

    int notas;
    String nome;

    public Alumno() {

    }

    public Alumno(int notas, String nome) {
        this.notas = notas;
        this.nome = nome;
    }

    public int getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nota=" + notas + ", nome=" + nome + '}';
    }

    public int compareTo(Object o) {
        Alumno al = (Alumno) o;
        if (this.nome.compareToIgnoreCase(al.nome) == 0) {
            return 0;
        } else {
            return -1;
        }
    }

}
