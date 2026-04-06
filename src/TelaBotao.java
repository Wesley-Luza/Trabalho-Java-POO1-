/*Tela 1 do exercicio 10*/

package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaBotao extends JFrame implements ActionListener {

    private JButton aparecermsg = new JButton("Clique no Botão! ");

    public TelaBotao() {
        setLayout(new FlowLayout());

        getContentPane().add(aparecermsg);

        aparecermsg.addActionListener(this);

        setSize(800, 600);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == aparecermsg) {
            new TelaHW();
        }
    }
}