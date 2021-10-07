import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class MyPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int winWidth = 630;
	private static int winHeight = 630;
	private static ArrayList<Shape> shapeList = new ArrayList<>();
	
	/**
	 * 
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for (Shape s : shapeList) {
			s.fill(g2d);
//			System.out.println(s.getArea()); // TESTING
		}
	}
	
	/**
	 * Draws the window UI with two buttons for loading and sorting shapes, as well as defines the buttons' actions.
	 */
	public static void drawUI() {
		MyPanel shapes = new MyPanel();
		JFrame frame = new JFrame("Load and sort shapes");
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		JPanel panel = new JPanel(new FlowLayout());
		JPanel panel2 = new JPanel(new BorderLayout());
		JButton loadButton = new JButton("Load shapes");
		JButton sortButton = new JButton("Sort shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel2.add(shapes);
		panel.add(loadButton);
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shapes.loadNew();
//				System.out.println("Load Shapes"); // TESTING
			}
		});
		panel.add(sortButton);
		sortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shapes.sortShapes();
//				System.out.println("Sort shapes"); // TESTING
			}
		});
		container.add(panel);
		container.add(panel2);
		frame.add(container);
		frame.setSize(winWidth, winHeight);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	/**
	 * Loads six random shapes of circle, square, or rectangle with random widths/heights between 10 and 100. Adds the shapes
	 * to an ArrayList of Shapes. Paints the shapes onto the window.
	 */
	public void loadNew() {
		ShapeFactory fact = new ShapeFactory();
		int shapeType;
		int randWidth;
		int randHeight;
		final int MIN = 1;
		final int MAX = 3;
		shapeList.clear();
		for (int i = 0; i < 6; i++) {
			shapeType = (int) Math.floor(Math.random() * (MAX - MIN + 1) + MIN);
			randWidth = (int) Math.floor(Math.random() * (100 - 10) + 10);
			randHeight = (int) Math.floor(Math.random() * (100 - 10) + 10);
			shapeList.add(fact.createNew(shapeType, randWidth, randHeight, i));
		}
		repaint();
	}
	
	/**
	 * Sorts the shapes from shapeList and paints the sorted list on the window. Calls <code>SortingTechnique.bubbleSort()</code> to
	 * sort the shapes.
	 */
	public void sortShapes() {
		if (shapeList.size() == 0) {
			System.out.println("ERROR: Empty list.");
			return;
		}
		SortingTechnique.bubbleSort(shapeList);
		for (int i = 0; i < 6; i++) {
			shapeList.get(i).setNum(i);
		}
		repaint();
	}
	
	/**
	 * Main method. Draws the UI.
	 * @param args
	 */
	public static void main(String[] args) {
		drawUI();
	}
}
