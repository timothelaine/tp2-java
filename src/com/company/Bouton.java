package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Bouton extends JButton implements MouseListener {

    private String name;

    Bouton(String str){
        super(str);
        this.name = str;

        this.addMouseListener(this);
    }
    public void paintComponents(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2d.setColor(Color.white);
        g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth()/ 2 /4), (this.getHeight() / 2) + 5);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
