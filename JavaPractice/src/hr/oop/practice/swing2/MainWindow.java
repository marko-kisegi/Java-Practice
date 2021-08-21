/**
 * 
 */
package hr.oop.practice.swing2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * @author Sui146
 *
 */
public class MainWindow extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public MainWindow() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocation(20,20);
		setSize(800,400);
		setTitle("First encapsulated window");
		initGUI();
	}

	/**
	 * 
	 */
	private void initGUI() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(() -> {
			new MainWindow().setVisible(true);
		});
	}

}
