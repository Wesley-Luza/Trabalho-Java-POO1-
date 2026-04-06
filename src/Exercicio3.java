/* Crie um programa (Exercicio3) que peça um número de 1 a 7 e mostre o
dia da semana correspondente.*/

package org.example;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        // Pedindo dia da semana para usuario
        System.out.println("Digite o dia da semana: ");
        numero = teclado.nextInt();

        // Condição para dias da semana irem de 1 a 7
        while(numero < 1 || numero > 7) {
            System.out.println("Numero informado inválido! Tente novamente.");
            numero = teclado.nextInt();
        }

        // Ifs para dizer qual dia da semana é, com base no numero colocado
        if(numero == 1) {
            System.out.println("Segunda-Feira.");
        } else if(numero == 2) {
            System.out.println("Terça-Feira.");
        } else if(numero == 3) {
            System.out.println("Quarta-Feira.");
        } else if(numero == 4) {
            System.out.println("Quinta-Feira.");
        } else if(numero == 5) {
            System.out.println("Sexta-Feira.");
        } else if(numero == 6) {
            System.out.println("Sabado.");
        } else if(numero == 7) {
            System.out.println("Domingo.");
        }

        teclado.close();
    }
}
