package javaPrograms;

public class InbuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Selenium ";
		String s2 = "Training";

		String s3 = s1 + s2;

		String s4 = s1.concat(s2);

		String s5 = s1.concat("with Simplilearn");

		System.out.println("Concatenation using + operator : " + s3);
		System.out.println("Concatenation using concat method :" + s4);
		System.out.println("Concatenation using concat method :" + s5);
	}

}
