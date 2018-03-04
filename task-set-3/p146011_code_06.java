// p146011@nu.edu.pk

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class p146011_code_06 extends JPanel implements KeyListener {        
    Point text_pos;
    int speed = 3;

    p146011_code_06() {
        text_pos = new Point(200, 200);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            text_pos.move(text_pos.x+speed, text_pos.y);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            text_pos.move(text_pos.x-speed, text_pos.y);
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            text_pos.move(text_pos.x, text_pos.y-speed);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            text_pos.move(text_pos.x, text_pos.y+speed);
        }

        repaint();
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Syed Owais Ali Chishti", text_pos.x, text_pos.y);
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Assignment 003 - Code 6");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new p146011_code_06();
        f.add(p);
        f.addKeyListener((KeyListener)p);    

        f.setVisible(true);
    }
}