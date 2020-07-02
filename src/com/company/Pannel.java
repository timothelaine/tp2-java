package com.company;

import javax.swing.*;
import java.awt.*;

public class Pannel extends JPanel {

    public void paintComponent(Graphics g){
        System.out.println("Je suis exécutée !");
        int x1 = this.getWidth()/4;
        int y1 = this.getHeight()/4;
        g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
    }
}
