// p146011@nu.edu.pk

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class p146011_code_07 extends JPanel implements KeyListener {        
    Point text_pos;
    int speed = 5;
    String str = "Syed Owais Ali Chishti";

    p146011_code_07() {
        text_pos = new Point(50, 50);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            text_pos.move(text_pos.x+speed, text_pos.y);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            text_pos.move(text_pos.x-speed, text_pos.y);
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            text_pos.move(text_pos.x, text_pos.y-speed);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            text_pos.move(text_pos.x, text_pos.y+speed);
        }

        repaint();
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Font f1 = new Font("Serif", Font.BOLD, 32);
        FontMetrics fm = g.getFontMetrics(f1);
        int width  = fm.stringWidth(str);
        int height = fm.getHeight();
        int width_space  = fm.stringWidth(" ");

        Dimension screen_size = this.getSize();
        g.setFont(f1);    
        
        if (screen_size.width - (text_pos.x + width) < -2) {
            String words[] = str.split(" ");
            
            int next_col = 0;
            int rel_pos = 0;
            for (int i = 0; i < words.length; i++) {
                String word = words[i];

                width  = fm.stringWidth(word);
                if (screen_size.width - (text_pos.x + width + rel_pos) < -1 && i != 0) {
                    next_col++;
                    rel_pos = 0;
                }
                g.drawString(word + " ", text_pos.x + rel_pos, text_pos.y + (next_col * height));                
                rel_pos += width + width_space;
            }
        }
        else {
            g.drawString(str, text_pos.x, text_pos.y);
        }
    }
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Assignment 003 - Code 7");
        f.setSize(500, 300);

        JPanel p = new p146011_code_07();
        f.add(p);
        f.addKeyListener((KeyListener)p);    
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}