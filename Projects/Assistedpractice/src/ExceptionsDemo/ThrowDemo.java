package ExceptionsDemo;

public class ThrowDemo {

	public void div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			int c = a / b;
			System.out.println(c);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowDemo t = new ThrowDemo();
		t.div(20, 0); //can't divide by 0  exception
	}

}
