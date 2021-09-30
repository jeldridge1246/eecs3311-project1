import java.awt.Graphics2D;

public class Square extends Shape {
	
	public int shapeType = 2;

	public Square(int width, int num) {
		super.setDimensions(width, width);
		super.setType(2);
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
		super.setArea(super.getWidth() * super.getWidth());
	}
	
}
