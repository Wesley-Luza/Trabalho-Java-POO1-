package org.example;

public class Classe_Quadrado extends Classe_Forma {
    private double lado;

    public Classe_Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}