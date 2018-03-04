// p146011@nu.edu.pk

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class p146011_code_02 extends JFrame {

    p146011_code_02() {
        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();
        JFrame frame3 = new JFrame();
        JFrame frame4 = new JFrame();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int frame_width = dim.width/2;
        int frame_height = dim.height/2;
        
        frame1.setSize(frame_width, frame_height);          
        frame2.setSize(frame_width, frame_height);          
        frame3.setSize(frame_width, frame_height);          
        frame4.setSize(frame_width, frame_height);          
        
        frame1.setLocation(0, 0);
        frame2.setLocation(frame_width, 0);
        frame3.setLocation(0, frame_height);
        frame4.setLocation(frame_width, frame_height);
        
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);
        frame4.setVisible(true);        
    }
    
    public static void main(String[] args) {
        p146011_code_02 window1 = new p146011_code_02();
    }

}