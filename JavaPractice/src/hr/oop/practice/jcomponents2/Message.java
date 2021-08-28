/**
 * 
 */
package hr.oop.practice.jcomponents2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JComponent;

/**
 * @author Sui146
 *
 */
public class Message extends JComponent{
	private static long serialVersionUID = 1L;
	private Color color;
	private String text;
	
	/**
	 * @param text
	 */
	public Message(String text) {
		this(Color.orange, text);
	}

	/**
	 * @param orange
	 * @param text2
	 */
	public Message(Color color, String text) {
		// TODO Auto-generated constructor stub
		this(color, text, null);
	}
	
	public Message(Color color, String text, Color backgroundColor) {
		super();
		if(color!=null) {
			this.color = color;
		} else {
			this.color = Color.ORANGE;
		}
		this.text = text;
		if(backgroundColor != null) {
			setOpaque(true);
			setBackground(backgroundColor);
		}
	}
	
	public void setColor(Color color) {
		this.color = color;
		repaint();
	}
	public void setText(String text) {
		this.text = text;
		revalidate();
		repaint();
	}
	@Override
	public Dimension getPreferredSize() {
		if(isPreferredSizeSet()) {
			return super.getPreferredSize();
		};
		Font font = getFont();
		FontMetrics fm = getFontMetrics(font);
		Dimension dim = new Dimension();
		dim.height = fm.getHeight() * 2;
		if(text!=null) {
			dim.width = fm.stringWidth(text)+10;
		}
		return dim;
	}
	
	@Override 
	protected void paintComponent(Graphics g) {
		Dimension size = getSize();
		
		if(isOpaque()) {
			g.setColor(getBackground());
			g.fillRect(0, 0, size.width, size.height);
		}
		Insets ins = getInsets();
		int x0 = ins.left;
		int y0 = ins.top;
		int width = size.width - ins.left - ins.right;
		int height = size.height - ins.top - ins.bottom;
		
		g.setColor(color);
		g.fillOval(x0, y0, width, height);
		
		FontMetrics fm = g.getFontMetrics();
		
		g.setColor(getForeground());
		g.drawString(text, 
				x0 + (width - fm.stringWidth(text)) / 2, 
				y0 + height - (height - fm.getAscent()) /2);
	}
}
