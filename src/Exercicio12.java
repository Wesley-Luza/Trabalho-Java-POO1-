/* Crie um programa (Exercicio12) que calcule e exiba o fatorial de um
número informado pelo usuário. */

package org.example;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int fatorial = 1;

        // Pedindo ao usuario qual numero vai ser realizado o fatorial
        System.out.println("Informe o número que deseja realizar o fatorial: ");
        numero = teclado.nextInt();

        // Condição para caso o numero digitado seja invalido
        while(numero <= 0) {
            System.out.println("Impossivel realizar fatorial. Tente novamente: ");
            numero = teclado.nextInt();
        }

        // Fazendo o numero * os menores que ele
        for(int i = numero; i >= 1; i--) {
            fatorial = fatorial * i;
        }

        // Saida
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        teclado.close();
    }
}
