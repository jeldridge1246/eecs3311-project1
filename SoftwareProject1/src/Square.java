import java.awt.Graphics2D;

public class Square extends Shape {
	
	public int shapeType = 2;

	/**
	 * Initializes a square with the given width and number in the sequence.
	 * @param width an int
	 * @param num an int representing the number in the sequence of the shape. Used for sorting and setting position on the window.
	 */
	public Square(int width, int num) {
		super.setDimensions(width, width);
		super.setType(2);
		super.setNum(num);
		calculateArea();
	}
	
	/**
	 * Implements the <code>fill()</code> method of the <code>Shape</code> class. Creates a square on the screen.
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
		super.setArea(super.getWidth() * super.getWidth());
	}
	
}
