import java.awt.Graphics2D;

public class Rectangle extends Shape {
	
	public int shapeType = 3;

	public Rectangle(int width, int height, int num) {
		super.setDimensions(width, height);
		super.setType(3);
		super.setNum(num);
		calculateArea();
	}
	
	@Override
	public void fill(Graphics2D g2d) {
		int x = super.getNum() * 100;
		g2d.setColor(super.getColor());
		g2d.fillRect(x, 200, super.getWidth(), super.getHeight());
	}
	
	@Override
	public void calculateArea() {
		super.setArea(super.getWidth() * super.getHeight());
	}
	
}
