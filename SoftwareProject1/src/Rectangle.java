import java.awt.Graphics2D;

public class Rectangle extends Shape {
	
	public int shapeType = 3;

	/**
	 * Initializes a rectangle with the given height, width, and number in the sequence.
	 * @param width an int 
	 * @param height an int
	 * @param num an int representing the number in the sequence of the shape. Used for sorting and setting position on the window.
	 */
	public Rectangle(int width, int height, int num) {
		super.setDimensions(width, height);
		super.setType(3);
		super.setNum(num);
		calculateArea();
	}
	
	/**
	 * Implements the <code>fill()</code> method of the <code>Shape</code> class. Creates a rectangle on the screen.
	 */
	public void fill(Graphics2D g2d) {
		int x = super.getNum() * 100;
		g2d.setColor(super.getColor());
		g2d.fillRect(x, 200, super.getWidth(), super.getHeight());
	}
	
	/**
	 * Implements the <code>calculateArea()</code> method fo the <code>Shape</code> class. 
	 */
	public void calculateArea() {
		super.setArea(super.getWidth() * super.getHeight());
	}
	
}
