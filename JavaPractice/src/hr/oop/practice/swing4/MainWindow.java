/**
 * 
 */
package hr.oop.practice.swing4;

import javax.swing.JFrame;
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
		setTitle("Moj prozor");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
