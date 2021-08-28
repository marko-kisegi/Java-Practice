/**
 * 
 */
package hr.oop.practice.jcomponents2;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * @author Sui146
 *
 */
public class MainWindow extends JFrame {
	private static long serialVersionUID = 1L;
	
	public MainWindow() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLocation(20,50);
		setSize(300, 200);
		setTitle("This is going well!");
		initGUI();
	}

	/**
	 * 
	 */
	private void initGUI() {
		// TODO Auto-generated method stub
		Container cp = getContentPane();
		
		cp.setLayout(null);
		
		Message msg1 = new Message("help");
		Message msg2 = new Message(Color.BLUE, "this isnt good");
		cp.add(msg1);
		cp.add(msg2);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new MainWindow().setVisible(true);
		});
	}
}
