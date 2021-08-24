/**
 * 
 */
package hr.oop.practice.jcomponents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
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
		
		Message msg1 = new Message(Color.orange);
		msg1.setBounds(0, 0, 130, 100);
		msg1.setBorder(new fullBorder(5, Color.red));
		msg1.setOpaque(true);
		msg1.setForeground(Color.black);
		msg1.setBackground(Color.blue);
		cp.add(msg1);
		
		Message msg2 = new Message(Color.orange);
		msg2.setBounds(140, 0 , 130, 100);
		msg2.setBorder(new fullBorder(5, Color.red));
		msg2.setOpaque(false);
		msg2.setForeground(Color.black);
		msg2.setBackground(Color.blue);
		cp.add(msg2);
	}
	private static class Message extends JComponent{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Color circleColor;
		public Message(Color color) {
			this.circleColor = color;
		}
		protected void paintComponent(Graphics g) {
			Dimension size = getSize();
			if(isOpaque()) {
				g.setColor(getBackground());
				g.fillRect(0, 0, size.width, size.height);
			}
			g.setColor(circleColor);
			g.fillOval(0,  0 , size.width, size.height);
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
