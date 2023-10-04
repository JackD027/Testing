package CalculateArea;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void displayArea() {
		System.out.println("Area of the Rectangle: " + calculateArea());
	}

	public double calculateArea() {
		return length * width;
	}

}
