
// "Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
//		+ "For numbers which are multiples of both three and five print “FizzBuzz”.

import java.util.InputMismatchException;
import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {

		System.out.println("Please insert a number.");
		Scanner in = new Scanner(System.in);
		int num = 0;
		while (in.hasNextInt()) {
			num = in.nextInt(); // this is important!
			try {
				fizzbuzzMethod(num);
			} catch (InputMismatchException exception) {
				System.out.println("Please enter an integer.");
			}
		}
		in.close();
	}// main

	static public String fizzbuzzMethod(int num) {

		String result = "";
		if (num % 3 == 0) {
			if (num % 5 == 0) {
				System.out.println("FizzBuzz");
				result = "FizzBuzz";
			} else {
				System.out.println("Fizz");
				result = "Fizz";
			}
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
			result = "Buzz";
		} else {
			System.out.println(num);
			result = String.valueOf(num);
		}

		return result;
	}

}// class
