// p146011@nu.edu.pk

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class p146011_code_03 extends JFrame {

    p146011_code_03() {
        JFrame frame = new JFrame();
        frame.setSize(500, 400);            
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //frame.setLocation(dim.width / 2 - frame.getSize().width / 2 , dim.height / 2 - frame.getSize().height /2);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        p146011_code_03 window1 = new p146011_code_03();
    }

}
