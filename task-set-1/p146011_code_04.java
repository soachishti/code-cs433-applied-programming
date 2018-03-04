// p146011@nu.edu.pk

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class p146011_code_04 extends JFrame {

    p146011_code_04() {
        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();
        JFrame frame3 = new JFrame();
        
        frame1.setSize(200, 150);           
        frame2.setSize(200, 150);           
        frame3.setSize(200, 150);           
        
        frame1.setLocation(200, 225);
        frame2.setLocation(225, 250);
        frame3.setLocation(250, 275);
        
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);
    }
    
    public static void main(String[] args) {
        p146011_code_04 window1 = new p146011_code_04();
    }

}