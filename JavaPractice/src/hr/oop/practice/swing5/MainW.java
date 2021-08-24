/**
 * 
 */
package hr.oop.practice.swing5;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class MainW extends JFrame{
	private static final long serialVersionUID = 1L;

	public MainW() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLocation(20, 50);
		setSize(300, 200);
		setTitle("My first component tomfoolery");
		
		InitGUI();
	}
	
	private void InitGUI() {
		//
		Container cp = getContentPane();
		cp.setLayout(null);
		Message msg = new Message();
		msg.setBounds(0, 0, 100, 100);
		msg.setBorder(new fullBorder(5, Color.RED));
		Message msg2 = new Message();
		msg2.setBounds(35, 45 , 90, 75);
		msg2.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
		Message msg3 = new Message();
		msg3.setBounds(75, 75, 100, 100);
		msg3.setBorder(BorderFactory.createDashedBorder(Color.BLACK));
		cp.add(msg2);
		cp.add(msg);
		cp.add(msg3);
	}
	
	private static class Message extends JComponent{
		private static final long serialVersionUID = 1L;
	}
	private static class fullBorder implements Border{
		private int thickness;
		private Color color;
		
		public fullBorder(int thickness, Color color) {
			super();
			this.thickness = thickness;
			this.color = color;
		}
		@Override
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			// TODO Auto-generated method stub
			g.setColor(color);
			g.fillRect(0, 0, width, thickness);
			g.fillRect(0, height - thickness, width, thickness);
			g.fillRect(0, thickness, thickness, height - 2 * thickness);
			g.fillRect(width - thickness, thickness, thickness, height - 2*thickness);
		}

		@Override
		public Insets getBorderInsets(Component c) {
			// TODO Auto-generated method stub
			return new Insets (thickness, thickness, thickness, thickness);
		}

		@Override
		public boolean isBorderOpaque() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> {
			new MainW().setVisible(true);
		});
	}

}
