/*Crie um programa (Exercicio9) que utilize um ArrayList de números
inteiros inseridos no código (não via scanner do teclado) e exiba todos
os números adicionados. */

package org.example;

import java.util.ArrayList;

public class Exercicio9 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando numeros nos arrays
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        // Lançando no terminal numeros dos arrays
        System.out.println("Números adicionados no ArrayList:");

        // Rodando ate sair o ultimo numero dos arrays
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}