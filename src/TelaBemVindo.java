/*Tela 2 do exercicio 20*/

package org.example;

import java.awt.*;
import javax.swing.*;

public class TelaBemVindo extends JFrame {

    private JLabel telaseguinte;

    public TelaBemVindo(String nome) {
        setLayout(new FlowLayout());

        telaseguinte = new JLabel("Bem-vindo(a), " + nome + "!");

        getContentPane().add(telaseguinte);

        setSize(800, 600);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}