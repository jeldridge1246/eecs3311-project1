public class ShapeFactory {
	
	public ShapeFactory() {}
	
	/**
	 * Creates a new shape.
	 * @param shapeType an int between 1 and 3 inclusive (1 = circle, 2 = square, 3 = rectangle)
	 * @param width an int; the width of the shape
	 * @param height an int; the height of the shape
	 * @param num an int; the number in the sequence of the shape
	 * @return the newly created Shape object. <code>null</code> if the shapeType is not between 1 and 3 inclusive.
	 */
	public Shape createNew(int shapeType, int width, int height, int num) {
		if (shapeType == 1) {
			return new Circle(width, num);
		} else if (shapeType == 2) {
			return new Square(width, num);
		} else if (shapeType == 3) {
			return new Rectangle(width, height, num);
		} else {
			System.out.println("WRONG TYPE");
			return null;
		}
	}
	
}
