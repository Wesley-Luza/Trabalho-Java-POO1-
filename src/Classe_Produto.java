/*Classe produto do exercicio 17*/

package org.example;

public class Classe_Produto {
    private String nomeproduto;
    private float valorproduto;
    private float desconto;
    private float valorfinal;

    public float descontodezporcento() {
        return desconto = valorproduto * 0.10f;
    }

    public float valortotalfinal() {
        return valorfinal = valorproduto - desconto;
    }
    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public float getValorproduto() {
        return valorproduto;
    }

    public void setValorproduto(float valorproduto) {
        this.valorproduto = valorproduto;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValorfinal() {
        return valorfinal;
    }

    public void setValorfinal(float valorfinal) {
        this.valorfinal = valorfinal;
    }
}
