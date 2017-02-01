/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.notas;
        hash = 89 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    public int compareTo(Object o) {
        Alumno al = (Alumno) o;
        if (this.nome.compareToIgnoreCase(al.nome) == 0) {
            return 0;
        } else if (this.nome.compareToIgnoreCase(al.nome) > 0) {
            return 1;
        } else {
            return -1;
        }
    }



}
