package org.example;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedindo ao usuario raio do circulo e lado do quadrado
        System.out.print("Informe o raio do círculo: ");
        double raio = teclado.nextDouble();

        System.out.print("Informe o lado do quadrado: ");
        double lado = teclado.nextDouble();

        // Puxando classes circulo e quadrado, que estão ligadas na classe abstrata forma
        Classe_Forma circulo = new Classe_Circulo(raio);
        Classe_Forma quadrado = new Classe_Quadrado(lado);

        // Saida
        System.out.printf("Área do círculo: %.2f%n", circulo.calcularArea());
        System.out.printf("Área do quadrado: %.2f%n", quadrado.calcularArea());

        teclado.close();
    }
}