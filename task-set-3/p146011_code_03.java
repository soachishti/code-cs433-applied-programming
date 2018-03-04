// p146011@nu.edu.pk

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class p146011_code_03 extends JFrame {

    p146011_code_03() {
        setTitle("Assignment 003 - Code 3");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseMoved(MouseEvent ev) {
                System.out.println("x: " + ev.getX() + "\ty: " + ev.getX());
            }
        });
    }

    public static void main(String[] args) {
        new p146011_code_03();
    }

}