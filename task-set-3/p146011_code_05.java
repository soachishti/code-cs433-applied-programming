// p146011@nu.edu.pk

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class p146011_code_05 extends JPanel implements MouseMotionListener, MouseListener {
    Point start;
    Graphics g;

    p146011_code_05() {
        addMouseListener(this);
        addMouseMotionListener(this);

        start = new Point(0,0);
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {
        System.out.println("(" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        start.move(e.getX(), e.getY());
    }

    public void mouseDragged(MouseEvent e) {
        g = getGraphics();            
        g.setColor(Color.black);
        g.drawLine(start.x, start.y, e.getX(), e.getY());
        start.move(e.getX(), e.getY());
    
        System.out.println("X: " + e.getX() + ", Y: " + e.getY());
    } 

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Assignment 003 - Code 5");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new p146011_code_05());
        f.setVisible(true);
    }

}