/* Crie um programa (Exercicio7) com uma classe Pessoa que tenha nome
e idade e um construtor. Instancie e exiba no main.*/

package org.example;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Puxando a classe pessoa para este exercicio
        Classe_Pessoa pessoa;
        pessoa = new Classe_Pessoa("Wesley", 19);

        // Lançando um print para exibir as informações da classe
        System.out.println("Meu nome é " + pessoa.getNome() + ", e minha idade é " + pessoa.getIdade());
        teclado.close();
    }
}
