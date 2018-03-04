// p146011@nu.edu.pk

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class p146011_code_02 extends JFrame implements MouseMotionListener {

    p146011_code_02() {
        setTitle("Assignment 003 - Code 2");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseMotionListener(this);
    }

    public void mouseMoved(MouseEvent ev) {
        System.out.println("x: " + ev.getX() + "\ty: " + ev.getX());
    }

    public void mouseDragged(MouseEvent ev) {}
    
    public static void main(String[] args) {
        new p146011_code_02();
    }

}