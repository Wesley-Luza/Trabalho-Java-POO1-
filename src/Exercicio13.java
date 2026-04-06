/*Crie um programa (Exercicio13) que sorteie um número de 1 a 50 e
permita ao usuário adivinhar qual foi o número sorteado. */

package org.example;

import java.util.Scanner;
import java.util.Random;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        int numeroSorteado = gerador.nextInt(50) + 1;
        int palpite = 0;
        int erros = 0;

        // Pedindo numero ao usuario para ver se adivinha
        System.out.println("=== BEM-VINDO AO JOGO DE ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar o número que eu pensei (entre 1 e 50).");

        // Aqui vai repetir isso ate encontrar o numero, quando o usuario digitar o correto
        do {
            System.out.print("\nDigite seu palpite: ");
            palpite = teclado.nextInt();

            if (palpite != numeroSorteado) {
                erros++;

                if (palpite < numeroSorteado) {
                    System.out.println("DICA: O número secreto é MAIOR que " + palpite);
                } else {
                    System.out.println("DICA: O número secreto é MENOR que " + palpite);
                }
                System.out.println("Você errou " + erros + " vez(es). Tente de novo!");
            }

        } while (palpite != numeroSorteado);

        // Saida de quando acertar o numero, com quantidade de erros
        System.out.println("\n-------------------------------------------");
        System.out.println("PARABÉNS! Você acertou o número: " + numeroSorteado);
        System.out.println("Total de erros durante a partida: " + erros);
        System.out.println("-------------------------------------------");

        teclado.close();
    }
}