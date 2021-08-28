/**
 * 
 */
package hr.oop.practice.jcomponents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

/**
 * @author Sui146
 *
 */
public class MainW extends JFrame{

	/**
	 * @param args
	 */
	public MainW() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLocation(20, 50);
		setSize(300,200);
		setTitle("Hello and Goodbye");
		initGUI();
	}
	/**
	 * 
	 */
	private void initGUI() {
		// TODO Auto-generated method stub
		Container cp = getContentPane();
		cp.setLayout(null);
		
		Message msg1 = new Message(Color.ORANGE, "Hello");
		msg1.setBounds(0, 0, 130, 100);
		msg1.setBorder(new fullBorder(5, Color.red));
		msg1.setOpaque(true);
		msg1.setForeground(Color.black);
		msg1.setBackground(Color.blue);
		
		Message msg2 = new Message(Color.ORANGE, "Hello in spanish");
		msg2.setBounds(140, 0 , 130, 100);
		msg2.setBorder(new fullBorder(5, Color.red));
		msg2.setOpaque(false);
		msg2.setForeground(Color.black);
		msg2.setBackground(Color.blue);
		
		Message msg3 = new Message(Color.ORANGE, "Hello");
		msg3.setBounds(140, 140, 130, 100);
		msg3.setBorder(new fullBorder(5, Color.red));
		msg3.setOpaque(true);
		msg3.setForeground(Color.black);
		msg3.setBackground(Color.blue);
		
		Message msg4 = new Message(Color.ORANGE, "Hello in spanish");
		msg4.setBounds(0, 140 , 130, 100);
		msg4.setBorder(new fullBorder(5, Color.red));
		msg4.setOpaque(false);
		msg4.setForeground(Color.black);
		msg4.setBackground(Color.blue);
		
		cp.add(msg1);
		cp.add(msg2);
		cp.add(msg3);
		cp.add(msg4);
	}
	private static class Message extends JComponent{

		private static final long serialVersionUID = 1L;
		private Color color;
		private String text;
		public Message(Color color) {
			super();
			this.color = color;
		}
		public Message(Color color, String text) {
			super();
			this.text = text;
			this.color = color;
		}
		
		public void setCircleColor(Color color) {
			this.color = color;
			repaint();
		}
		
		public void setText(String text) {
			this.text = text;
		}
		protected void paintComponent(Graphics g) {
			Dimension size = getSize();
			if(isOpaque()) {
				g.setColor(getBackground());
				g.fillRect(0, 0, size.width, size.height);
			}
			g.setColor(color);
			g.fillOval(0,  0 , size.width, size.height);
			Insets ins = getInsets();
			int x0 = ins.left;
			int y0 = ins.top;
			int width = size.width - ins.left - ins.right;
			int height = size.height - ins.top - ins.bottom;

			FontMetrics fm = g.getFontMetrics();
			g.setColor(getForeground());
			g.drawString(text, 
					x0+(width-fm.stringWidth(text))/2, 
					y0+height-(height-fm.getAscent())/2);
		}
	}
		
	private static class fullBorder implements Border{
		private int thickness;
		private Color color;
		@Override
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			// TODO Auto-generated method stub
			g.setColor(color);
			g.fillRect(0, 0, width, thickness);
			g.fillRect(0, height-thickness, width, thickness);
			g.fillRect(0, thickness, thickness, height - 2 * thickness);
			g.fillRect(width - thickness, thickness, thickness, height - 2 * thickness);

		}
		@Override
		public Insets getBorderInsets(Component c) {
			// TODO Auto-generated method stub
			return new Insets(thickness, thickness, thickness, thickness);
		}
		@Override
		public boolean isBorderOpaque() {
			// TODO Auto-generated method stub
			return false;
		}
		public fullBorder(int thickness, Color color) {
			super();
			this.thickness = thickness;
			this.color = color;
		}
	}

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(()->{
			new MainW().setVisible(true);
		});
	}

}
