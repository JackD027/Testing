package ArrayListObject;

import java.util.ArrayList;

import CalculateArea.*;

public class ArrayListObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Shape> shapes = new ArrayList<>();

		try {

			shapes.add(new Rectangle(4, 6));
			shapes.add(new Square(4));
			shapes.add(new Circle(5));
			for (Shape shape : shapes) {
				shape.displayArea();
			}
		} catch (Exception e) {
			System.err.println("An error occurred: " + e.getMessage());
		} finally {
			System.out.println("Program execution completed.");
		}

	}

}
