/* Crie um programa (Exercicio14) que leia 10 idades e informe quantas
pessoas são maiores de idade. */

package org.example;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        int maior = 0, menor = 0;

        // Pedindo as 10 idades para usuario
        for(int i = 1; i < 11; i++) {
            System.out.println("Informe a idade da " + i + "º pessoa: ");
            idade = teclado.nextInt();

            // Condição para verificar se numero informado é invalido
            while(idade <= 0) {
                System.out.println("Idade invalida. Tente novamente: ");
                idade = teclado.nextInt();
            }

            // Ifs para ver se é menor ou maior de idade
            if(idade < 18) {
                menor = menor + 1;
            } else {
                maior = maior + 1;
            }
        }

        // Saida no terminal
        System.out.println("Quantidade de pessoas maiores de idade: " + maior);
        System.out.println("Quantidade de pessoas menores de idade: " + menor);

        teclado.close();
    }
}
