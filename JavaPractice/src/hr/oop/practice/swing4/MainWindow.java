/**
 * 
 */
package hr.oop.practice.swing4;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


/**
 * @author Sui146
 *
 */
public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	
	/**
	 * @param args
	 */
	private MainWindow() {
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		setLocation(20, 50);
		setSize(800, 400);
		setTitle("My window into the unknown.");
		addWindowListener(new WindowAdapter() {
			private int counter = 0;
			@Override 
			public void windowClosing(WindowEvent e) {
				counter++;
				if(counter == 3) dispose();
			}
		});
		initGUI();
		
	}
	private void initGUI() {
		Point p = new Point(50,100);
		System.out.format("%d, %d %n", p.x, p.y );
		
		Dimension d = new Dimension(50, 100);
		System.out.format(" dimension %d %d", d.width, d.height);

		Rectangle r = new Rectangle(10, 10, 50, 100);
		System.out.format("(%d, %d, %d, %d) %n", r.x, r.y, r.width, r.height);
		
		Insets ins = new Insets(10, 5 , 10 , 5);
		System.out.format("(%d, %d, %d, %d) %n", ins.top, ins.left, ins.bottom, ins.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(()->{ new MainWindow().setVisible(true);
		});
		
	}

}
