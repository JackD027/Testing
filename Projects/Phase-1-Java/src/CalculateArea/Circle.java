package CalculateArea;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int radius){
		this.radius=radius;
	}
	
	@Override
	public void displayArea() {
		System.out.println("Area of the Circle: " + calculateArea());
	}

	public double calculateArea() {
		return 3.14 * radius;
	}
}
