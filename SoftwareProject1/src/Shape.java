import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

public class Shape implements Comparable<Shape> {
	private double area;
	private int height;
	private int width;
	private int shapeType;
	private int num;
	Random rand;
	private float r, g, b;
	private Color color;
	
	/**
	 * Creates a default Shape with a random colour
	 */
	public Shape() {
		this.area = 0;
		this.height = 0;
		this.width = 0;
		this.shapeType = 0;
		rand = new Random();
		r = rand.nextFloat();
		g = rand.nextFloat();
		b = rand.nextFloat();
		color = new Color(r, g, b);
	}
	
	/**
	 * Sets the type of shape as an int (1 = circle, 2 = square, 3 = rectangle)
	 * @param type an int representation of the type of shape
	 */
	public void setType(int type) {
		this.shapeType = type;
	}
	
	/**
	 * Sets the width of the shape
	 * @param width an int
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * Sets the height of the shape
	 * @param height an int
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * Sets the number in the sequence of the shape. Used for sorting and positioning shapes on the UI.
	 * @param num the position of the shape, starting from 0. The default window size supports up to 6 shapes.
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	/**
	 * Quickly define both the height and the width of a shape
	 * @param width an int
	 * @param height an int
	 */
	public void setDimensions(int width, int height) {
		setWidth(width);
		setHeight(height);
	}
	
	/**
	 * Sets the area of the shape. Used in <code>calculateArea()</code> methods to set the area
	 * @param area a double
	 */
	protected void setArea(double area) {
		this.area = area;
	}
	
	/**
	 * Retrieves the width of a shape
	 * @return the width of the shape
	 */
	public int getWidth() {
		return this.width;
	}
	
	/**
	 * Retrieves the height of the shape
	 * @return the height of the shape
	 */
	public int getHeight() {
		return this.height;
	}
	
	/**
	 * Retrieves the type of the shape
	 * @return the type of the shape (1 = circle, 2 = square, 3 = rectangle)
	 */
	public int getType() {
		return this.shapeType;
	}
	
	/**
	 * Retrieves the position in the sequence of the shape
	 * @return
	 */
	public int getNum() {
		return this.num;
	}
	
	/**
	 * Retrieves the randomly generated color of the shape, generated when the Shape was constructed. 
	 * @return the color of the shape
	 */
	public Color getColor() {
		return this.color;
	}
	
	/**
	 * Retrieves the area of the shape
	 * @return the area of the shape
	 */
	public double getArea() {
		return this.area;
	}
	
	/**
	 * Creates the shape on the window. Meant to be overridden by a child shape.
	 * @param g2d the Graphics2D component
	 */
	public void fill(Graphics2D g2d) {
		System.out.println("DEFAULT FILL");
	}
	
	/**
	 * Calculates the area of the shape. Meant to be overridden by a child shape. Sets area to -1 if not overridden.
	 */
	public void calculateArea() {
		this.area = -1;
	}

	/**
	 * Compares one shape to another based on their surface areas. 
	 */
	@Override
	public int compareTo(Shape o) {
		if (this.area < o.getArea()) {
			return -1;
		} else if (this.area == o.getArea()) {
			return 0;
		} else {
			return 1;
		}
	}
}
