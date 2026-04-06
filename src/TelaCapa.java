/*Tela 1 do exercicio 20*/

package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaCapa extends JFrame implements ActionListener {

    private JLabel nomeLabel = new JLabel("Insira seu nome: ");
    private JTextField campoNome = new JTextField(20);
    private JButton envio = new JButton("Enviar");

    public TelaCapa() {
        setLayout(new FlowLayout());

        getContentPane().add(nomeLabel);
        getContentPane().add(campoNome);
        getContentPane().add(envio);

        envio.addActionListener(this);

        setSize(800, 600);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == envio) {
            String nomeDigitado = campoNome.getText();
            new TelaBemVindo(nomeDigitado);
        }
    }
}