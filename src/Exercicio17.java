/*Crie um programa (Exercicio17) com uma classe Produto e um metodo
para calcular desconto de 10% sobre o preço. Instancie e demonstre o
uso.*/

package org.example;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pegando informações sobre a classe produto
        Classe_Produto produto = new Classe_Produto();

        // Pedindo ao usuario para informar as variaveis da classe produto
        System.out.println("Informe o produto que deseja comprar: ");
        produto.setNomeproduto(teclado.nextLine());

        System.out.println("Informe o valor do produto que deseja comprar: ");
        produto.setValorproduto(teclado.nextFloat());

        // Saida com as informações da classe produto
        System.out.println("BEM VINDO AS INFORMAÇÕES DO SEU PRODUTO!");
        System.out.println("Nome do Produto: " + produto.getNomeproduto());
        System.out.println("Valor do Produto: " + produto.getValorproduto());
        System.out.println("Desconto de 10%: " + produto.descontodezporcento());
        System.out.println("Valor final: " + produto.valortotalfinal());

        teclado.close();
    }
}
