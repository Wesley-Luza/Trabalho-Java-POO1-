/*Tela 2 do exercicio 10*/

package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaHW extends JFrame {

    private JLabel hellow = new JLabel("Olá, mundo! ");

    public TelaHW() {
        setLayout(new FlowLayout());

        getContentPane().add(hellow);

        setSize(800, 600);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}