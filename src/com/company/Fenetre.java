package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {

    private Pannel pan = new Pannel();
    private JButton bouton = new Bouton("Transferer");
    private JButton bouton2 = new Bouton("OK");
    private  JLabel label = new JLabel();
    private JPanel container = new JPanel();

    public Fenetre(Client c) {
        this.setTitle("Ma première fenêtre Java");
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setText(c.toString());


        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        container.add(pan, BorderLayout.CENTER);
        container.add(label, BorderLayout.NORTH);


        bouton.addActionListener(this);
        bouton2.addActionListener(this);

        JPanel south = new JPanel();
        south.add(bouton);
        south.add(bouton2);
        container.add(south, BorderLayout.SOUTH);


        //Définition d'une police d'écriture
        Font police = new Font("Tahoma", Font.BOLD, 16);
        //On l'applique au JLabel
        label.setFont(police);
        //Changement de la couleur du texte
        label.setForeground(Color.blue);
        //On modifie l'alignement du texte grâce aux attributs statiques
        //de la classe JLabel
        label.setHorizontalAlignment(JLabel.CENTER);


        this.setContentPane(container);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Vous avez cliqué " );
    }
}
