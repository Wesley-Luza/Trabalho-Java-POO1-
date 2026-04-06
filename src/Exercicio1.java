/* Crie um programa (Exercicio1) que leia dois números e diga se o
primeiro é maior, menor ou igual ao segundo. */

package org.example;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

    float num1;
    float num2;

        //Pedindo para usuario digitar os numeros

        System.out.println("Digite o primeiro número: ");
        num1 = teclado.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = teclado.nextFloat();

        // Fazendo comparação para ver qual é menor e qual maior

        if(num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo!");
        } else if(num1 < num2) {
            System.out.println("O primeiro número é menor que o segundo!");
        } else {
            System.out.println("Os números são iguais!");
        }

        teclado.close();
        }
    }
