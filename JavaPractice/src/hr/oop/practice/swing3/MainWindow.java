/**
 * 
 */
package hr.oop.practice.swing3;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 * @author Sui146
 *
 */
public class MainWindow extends JFrame {
	private static final long setVersionUID = 1L;

	/*
	 * WindowListener 
	 */
	private static class GeneralWindowManager implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("open");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("closing");
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("closed");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("turned into an icon");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("turned back from an icon");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("activated");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("deactivated");
		}
	}
	
	private static class ChangeOfStates implements WindowStateListener{
		/*
		 *  java.awt.event.WWindowState listener defines one method
		 *  windowStateChanged.
		 *  a state can be maximized, icon and normal
		 */
		@Override
		public void windowStateChanged(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e);
		}
		
	}
	
	public MainWindow() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setLocation(20,50);
		setSize(300,200);
		setTitle("My 5th window!");
		
		addWindowListener(new GeneralWindowManager());
		addWindowStateListener(new ChangeOfStates());
		initGUI();
	}
	
	private void initGUI() {
		//
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			new MainWindow().setVisible(true);
			
		});
	}
}
