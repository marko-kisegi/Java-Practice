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
public class Window {
	private static class Run implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			JFrame frame = new JFrame();
			frame.setLocation(20, 50);
			frame.setSize(300, 200);
			frame.setTitle("ADHD Manager");
			frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		}
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Run());
		}
		
	}

}
