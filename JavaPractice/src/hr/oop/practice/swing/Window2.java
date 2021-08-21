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
public class Window2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame();
				frame.setLocation(100, 100);
				frame.setSize(800, 400);
				frame.setTitle("Second window");
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				frame.setVisible(true);
			};
		});

	}
	
}

