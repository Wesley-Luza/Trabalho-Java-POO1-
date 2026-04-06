/*Classe pessoa do exercicio 7*/

package org.example;

public class Classe_Pessoa {
    private String nome;
    private int idade;

    public Classe_Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}