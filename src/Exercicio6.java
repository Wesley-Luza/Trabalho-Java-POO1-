/* Crie um programa (Exercicio6) que tenha uma classe Carro com
atributos marca e ano. Instancie um carro e exiba as informações no
main.*/

package org.example;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Puxando as informações da classe carro
        Classe_Carro carro1 = new Classe_Carro();

        System.out.println("BEM VINDO AS INFORMAÇÕES DO SEU CARRO!");

        // Lançando as informações com base nas variaveis da classe carro
        System.out.println("Digite a marca do seu carro: ");
        carro1.setMarca(teclado.nextLine());

        System.out.println("Digite o ano do seu carro: ");
        carro1.setAno(teclado.nextInt());

        // Saida das variaveis
        System.out.println("Marca do Carro: " + carro1.getMarca());
        System.out.println("Ano do Carro: " + carro1.getAno());

        teclado.close();
    }
}
