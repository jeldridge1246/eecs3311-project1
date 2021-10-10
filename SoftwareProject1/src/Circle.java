import java.awt.Graphics2D;

public class Circle extends Shape {
	
	public int shapeType = 1;

	/**
	 * Initializes a circle with the given diameter and number in the sequence.
	 * @param diameter an int (also known as the width of the shape)
	 * @param num an int representing the number in the sequence of the shape. Used for sorting and setting position on the window.
	 */
	public Circle(int diameter, int num) {
		super.setDimensions(diameter, diameter);
		super.setType(1);
		super.setNum(num);
		calculateArea();
	}
	
	/**
	 * Implements the <code>fill()</code> method of the <code>Shape</code> class. Creates a circle on the screen.
	 */
	public void fill(Graphics2D g2d) {
		int x = super.getNum() * 100;
		g2d.setColor(super.getColor());
		g2d.fillOval(x, 200, super.getWidth(), super.getHeight());
	}
	
	/**
	 * Implements the <code>calculateArea()</code> method fo the <code>Shape</code> class. 
	 */
	public void calculateArea() {
		super.setArea(Math.PI * Math.pow(super.getWidth() / 2, 2));
	}
	
}
