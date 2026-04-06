/* Crie um programa (Exercicio2) que peça a idade e informe se é maior ou
menor de idade. */

package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade;

        // Pedindo a idade para usuario

        System.out.println("Informe sua idade: ");
        idade = teclado.nextInt();

        // Condição para numero invalido na idade

         while(idade < 0) {
             System.out.println("Idade invalida! Informe novamente: ");
             idade = teclado.nextInt();
         }

         // Comparação menor e maior de idade

        if(idade < 18) {
            System.out.println("Você é menor de idade. ");
        } else if(idade >= 18) {
            System.out.println("Você é maior de idade. ");
        }

        teclado.close();
    }
}