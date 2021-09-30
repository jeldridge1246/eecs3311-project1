import java.util.ArrayList;

public class SortingTechnique {
	
	private static SortingTechnique instance = new SortingTechnique();
	
	private SortingTechnique() {}
	
	public static SortingTechnique getInstance() {
		return instance;
	}
	
	public static void bubbleSort(ArrayList<Shape> shapeList) {
		int n = shapeList.size();
		boolean sorted = false;
		
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < n - 1; i++) {
				if (shapeList.get(i).compareTo(shapeList.get(i + 1)) > 0) {
					Shape temp = shapeList.get(i);
					shapeList.set(i, shapeList.get(i + 1));
					shapeList.set(i + 1, temp);
					sorted = false;
				}
			}
		}
	}
	
}
