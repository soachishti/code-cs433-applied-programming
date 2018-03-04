// p146011@nu.edu.pk

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

public class p146011_code_05 extends JFrame {

    p146011_code_05() {
        JFrame frame = new JFrame();
        frame.setLocation(100, 100);

        JDesktopPane desktop = new JDesktopPane();

        JInternalFrame intf1 = new JInternalFrame("Mail Reader", true, true, true, true);
        JInternalFrame intf2 = new JInternalFrame("Compose Mail", true, true, true, true);
        JInternalFrame intf3 = new JInternalFrame("Users", true, true, true, true);
        
        frame.setSize(700, 300);            
        
        intf1.setBounds(25, 25, 200, 150);
        intf2.setBounds(250, 15, 200, 120);
        intf3.setBounds(475, 75, 200, 170);

        desktop.add(intf1);
        desktop.add(intf2);
        desktop.add(intf3);

        frame.add(desktop);

        intf1.setVisible(true);
        intf2.setVisible(true);
        intf3.setVisible(true);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        p146011_code_05 window1 = new p146011_code_05();
    }

}