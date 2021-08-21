/**
 * 
 */
package hr.oop.practice.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
/**
 * @author Sui146
 *
 */
public class Window3Lambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(()->{
			JFrame frame = new JFrame(); // makes window
			frame.setLocation(50,50); // sets the location of the window left top
			frame.setSize(800,400); // sets the size of the window with width being first
			frame.setTitle("Window 3 Lambda"); // sets Title on the window the thing above like projects in eclipse
			frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // what to do when we close the window
			frame.setVisible(true); 
		});
	}

}
