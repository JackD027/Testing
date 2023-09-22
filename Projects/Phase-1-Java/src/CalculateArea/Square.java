package CalculateArea;

public class Square extends Shape {

	private int length;

	public Square(int length) {
		this.length = length;

	}

	@Override
	public void displayArea(){
		System.out.println("Area of the Square: " + calculateArea());
	}

	public double calculateArea() {
		return length * length;
	}
}
