/*Crie um programa (Exercicio15) que leia 4 notas de um aluno e informe
se o aluno foi aprovado (média >= 7). */

package org.example;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota;
        float media = 0;

        // Pedindo as 4 notas para o usuario
        for(int i = 1; i < 5; i++) {
            System.out.println("Informe a " + i + "º nota do aluno: ");
            nota = teclado.nextFloat();

            // Condição para verificar se numero é invalido ou nao
            while(nota < 0 || nota > 10) {
                System.out.println("Erro. Informe valor de 0 a 10.");
                nota = teclado.nextFloat();
            }

            // Media é a soma das notas dividido por 4
            media += nota / 4;
        }

        // Saida da media das notas
        System.out.println("A media das 4 notas é: " + media);

        // Condição para dizer se aluno esta aprovado ou nao
        if(media >= 7) {
            System.out.println("O aluno está aprovado na matéria! ");
        } else {
            System.out.println("O aluno foi reprovado na matéria! ");
        }
        teclado.close();
    }
}
