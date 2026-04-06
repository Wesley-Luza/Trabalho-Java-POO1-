/* Crie um programa (Exercicio5) que crie um vetor com 5 nomes inseridos
no código (não via scanner do teclado) e exiba cada um deles na tela.*/

package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nomes = {"Wesley", "Carlos", "Kauan", "Higor", "Jean"};

        // Saida dos nomes informados na String acima
        System.out.println("Os nomes: " + Arrays.toString(nomes));

        teclado.close();
    }
}
