/* Crie um programa (Exercicio4) que exiba a tabuada de um número
informado pelo usuário.*/

package org.example;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numtabuada;

        // Pedindo numero para usuario, para fazer a tabuada
        System.out.println("Digite o número para sair a tabuada: ");
        numtabuada = teclado.nextInt();

        // For para fazer o numero colocado vezes 1 ate 10
        for(int i = 0; i < 11; i++) {
            System.out.println(numtabuada + "*" + i + "=" + (numtabuada*i));
        }
        teclado.close();
    }
}
