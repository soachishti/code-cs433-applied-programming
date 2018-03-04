// p146011@nu.edu.pk

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class p146011_code_01 extends JFrame {

    p146011_code_01() {
        JFrame frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(screenSize.width, screenSize.height);
        frame.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true); 
    }
    
    public static void main(String[] args) {
        p146011_code_01 window1 = new p146011_code_01();
    }

}