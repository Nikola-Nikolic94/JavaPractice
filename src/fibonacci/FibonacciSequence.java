package fibonacci;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.println("Insert length of the sequence n");
		int n = s.nextInt();
		int[] x = new int[n];
		int firstNumber = 0;
		int secondNumber = 0;
		String print = "This is valid Fibonacci sequence";

		for (int i = 0; i < n; i++) {
			System.out.println("Insert new number");
			int newNumber = s.nextInt();
			x[i] = newNumber;
			if (i == 0) {
				firstNumber = newNumber;
			}
			if (i == 1) {
				secondNumber = newNumber;
			}
			if (i > 1 && firstNumber + secondNumber == newNumber) {
				firstNumber = secondNumber;
				secondNumber = newNumber;
			} else if (i > 1 && firstNumber + secondNumber != newNumber) {
				print = "This is not valid Fibonacci sequence";
			}
		}
		System.out.println(print);
		s.close();

	}

}
