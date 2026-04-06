/*Crie um programa (Exercicio16) que tenha uma classe Funcionario com
nome, cargo e salário, e exiba suas informações no main.*/

package org.example;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Puxando classe funcionario para main
        Classe_Funcionario funcionario = new Classe_Funcionario();

        // Pedindo informações para usuario sobre o funcionario
        System.out.println("Informe o nome do funcionario: ");
        funcionario.setNome(teclado.nextLine());

        System.out.println("Informe o cargo do funcionario: ");
        funcionario.setCargo(teclado.nextLine());

        System.out.println("Informe o salario do funcionario: ");
        funcionario.setSalario(teclado.nextInt());

        // Saida com as informações do funcionario
        System.out.println("BEM VINDO AS INFORMAÇÕES DO FUNCIONARIO!");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salario: " + funcionario.getSalario());

        teclado.close();
    }

}
