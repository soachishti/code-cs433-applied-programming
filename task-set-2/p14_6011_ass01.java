import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class p14_6011_ass01 extends JFrame{
	
	JMenuBar mb;
	JMenu m_file;
	JMenuItem mi_save_as_image;
	JMenuItem mi_exit;
	JMenuItem mi_about;
	Plotter plot_panel;

	p14_6011_ass01() {
		setSize(800,500);
		setTitle("Java Plotter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 2));
		
		load_menu();

		JPanel input = new JPanel();
		input.setLayout(new GridLayout(3, 2));

		input.add(new Label("ytics"));
		input.add(new JTextField());

		add(input);

		plot_panel = new Plotter(){
			
		};
		add(plot_panel);

		setVisible(true);
	}

	public void load_menu() {
		mb = new JMenuBar();

		m_file = new JMenu("File");
		mb.add(m_file);

		mi_save_as_image = new JMenuItem(new AbstractAction("Save as Image") {
		    public void actionPerformed(ActionEvent e) {
		    	JFileChooser fileChooser = new JFileChooser();
		    	fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PNG Files", "png"));
		    	if (fileChooser.showSaveDialog(p14_6011_ass01.this) == JFileChooser.APPROVE_OPTION) {
  					File file = fileChooser.getSelectedFile();
  					plot_panel.save_as_image(file.toString() + ".png");
		        }     
		    }
		});
		m_file.add(mi_save_as_image);

		m_file.addSeparator();

		mi_exit = new JMenuItem("Exit");
		m_file.add(mi_exit);

		mi_about = new JMenuItem("About");
		mb.add(mi_about);

		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		p14_6011_ass01 f = new p14_6011_ass01();
	}

}

class Plotter extends JPanel {
	Plotter() {
		this.setOpaque(true);
        this.setBackground(Color.WHITE);
	}

	public void drawDashedLine(Graphics g, int x1, int y1, int x2, int y2) {
        Graphics2D g2d = (Graphics2D) g.create();
        Stroke dotted = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] {1,2}, 0);
        g2d.setStroke(dotted);
        g2d.drawLine(x1, y1, x2, y2);
        g2d.dispose();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Dimension size = this.getBounds().getSize();
		
		int jump = 50;
		int block_size = 30;
		int blocks_vertical = size.width / block_size;
		int blocks_horizontal = size.height / block_size;
		int horizontal_center = (blocks_horizontal/2) * block_size;
		int vertical_center = (blocks_vertical/2) * block_size;
		
		Font currentFont = g.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 0.8F);
		g.setFont(newFont);

		int start_val = (int)Math.round(blocks_horizontal/2) * -1;
		int counter = 0;
		for (int x = 0; x < size.height; x += block_size) {
			this.drawDashedLine(g, 0, x, size.width, x);
			g.drawString(Integer.toString((start_val + counter)  * -1), vertical_center + 2, x - 1);
			counter++;
		}
		
		start_val = (int)Math.round(blocks_vertical/2) * -1;
		counter = 0;
		for (int y = 0; y < size.width; y += block_size) {
			this.drawDashedLine(g, y, 0, y, size.height);
			g.drawString(Integer.toString((start_val + counter) * jump), y+1, horizontal_center + 11);
			counter++;

		}
		
		g.setColor(Color.RED);
		// Vertical Line
		g.drawLine(
				0,
				horizontal_center,
				size.width,
				horizontal_center
		);

		// Horizontal Line
		g.drawLine(
				vertical_center,
				0,
				vertical_center,
				size.height
		);
				
		g.setColor(Color.BLUE);
		// Plotting
		int x1 = vertical_center + (block_size*0);
		int y1 = horizontal_center;
		int x2 = 0;
		int y2 = 0;
		boolean started = false;
		for (int x = (int)Math.round(blocks_vertical/2) * -1; x <= (int)Math.round(blocks_vertical+1/2); x++) {
			
			double y = Math.sin(x*jump);
			
			int sign = y > 0 ? 1 : -1;
			x2 = vertical_center + (block_size * x);
			y2 = (int) (horizontal_center - ((Math.round(((horizontal_center/2.0) * Math.abs(y))))) * sign);

			if (started)
			{
				g.drawOval(x2-1,y2-1,3,3);
				g.drawLine(x1, y1, x2, y2);
			}
			x1 = x2;
			y1 = y2;
			
			started = true;
		}
	}

	public void save_as_image(String filename)
    {
        Dimension size = this.getSize();
        BufferedImage image = new BufferedImage(size.width, size.height, BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D g2 = image.createGraphics();
        this.paint(g2);
        try
        {
            ImageIO.write(image, "png", new File(filename));
            JOptionPane.showMessageDialog(null, "Image saved.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}