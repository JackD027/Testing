package ExceptionsDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		try (PrintWriter writer = new PrintWriter(
				new File("C:\\Users\\Shubhendu Shekhar\\Desktop\\updated-file.docx"))) {

			writer.println("hello All");

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("No fiel found");
		}

	}

}
