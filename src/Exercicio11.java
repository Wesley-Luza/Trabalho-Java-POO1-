/*Crie um programa (Exercicio11) que peça 5 números e exiba o maior e o
menor valor.*/

package org.example;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numero;
        float maior = 0, menor = 0;

        // Pedindo 5 numeros ao usuario
        for(int i = 1; i < 6; i++) {
            System.out.println("Informe o " + i + "º número: ");
            numero = teclado.nextFloat();

            // Condição para ver qual numero é maior e qual é menor
            if (i == 1) {
                maior = numero;
                menor = numero;
            } else {
                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        // Saida dos numeros
            System.out.println("O maior número é o: " + maior);
            System.out.println("O menor número é o: " + menor);

        teclado.close();

        }
    }

