package org.example;

public class Classe_Circulo extends Classe_Forma {
    private double raio;

    public Classe_Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}