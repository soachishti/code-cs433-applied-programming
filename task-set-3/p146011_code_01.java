// p146011@nu.edu.pk

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class p146011_code_01 extends JFrame implements ActionListener{

    p146011_code_01() {
        setTitle("Assignment 003 - Code 1");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JButton b1 = new JButton("Button 1");
        b1.addActionListener(this);

        JButton b2 = new JButton("Button 2");
        b2.addActionListener(this);

        add(b1);
        add(b2); 
    }

    public void actionPerformed(ActionEvent ev) {
        JButton b = (JButton) ev.getSource();
        JOptionPane.showMessageDialog(null, b.getText() + " is pressed.");
    }
    
    public static void main(String[] args) {
        p146011_code_01 window1 = new p146011_code_01();
    }

}