// p146011@nu.edu.pk

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class p146011_code_04 extends JPanel {

    int chart_per_row = 4;

    double marks_total = 150;

    Color c[] = {Color.red, Color.blue, Color.green};

    String name[] = {"Omar Khan", "Arbab Rahim", "Bilal Jan", "Omar Khan", "Arbab Rahim", "Bilal Jan", "Omar Khan", "Arbab Rahim", "Bilal Jan"};
    int eng1[] = {40, 20, 30, 40, 20, 30, 40, 20, 30};
    int urdu[] = {25, 50, 40, 40, 20, 30, 40, 20, 30};
    int math[] = {35, 45, 15, 40, 20, 30, 40, 20, 30};

    int chart_size = 100;
    int marks_per_subject = 50;
        
    p146011_code_04() {
        
    }

    public void drawPlot(Graphics g, int x, int y, String name, int[] m) {
        float marks_sum = m[0] + m[1] + m[2];

        g.setColor(Color.black);
        g.drawString(name, x-10, y);
        g.drawString(marks_sum + "/" + marks_total, x-10, y+20);
        
        int start_angle = 0;
        int end_angle = (int)Math.round((m[0] / marks_sum) * 360.0);

        for (int i = 1; i <= 3; i++) {
            g.drawArc(x-20, y+30, chart_size, chart_size, start_angle, end_angle);
            g.setColor(c[i-1]);
            g.fillArc(x-20, y+30, chart_size, chart_size, start_angle, end_angle);

            if (i < 3) {
                start_angle = start_angle + end_angle;
                end_angle = (int)Math.round((m[i]/marks_sum) * 360);
            }
        }
    }

    public void paintComponent(Graphics g) {
        for (int i = 0; i < name.length; i++) {
            int marks[] = {eng1[i], urdu[i], math[i]};    

            int row = i / chart_per_row;
            int col = i % chart_per_row;
            
            int x = (50 + (col * 150)) ;
            int y = 40 + (row * (int)(chart_size * 1.8));

            drawPlot(g, x, y, name[i], marks);
        }
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Assignment 003 - Code 4");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p146011_code_04 p = new p146011_code_04();
        
        f.add(p);
        f.setVisible(true);
    }

}