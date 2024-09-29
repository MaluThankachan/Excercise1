package ScannerClassExamples;

import java.util.Scanner;

public class ScannerInteger1 {

	public static void main(String[] args) {
		System.out.println("Enter the first number");
		Scanner s1 = new Scanner(System.in);
		int i1 = s1.nextInt();
		System.out.println("Enter the second number");
		Scanner s2 = new Scanner(System.in);
		int i2 = s2.nextInt();
		System.out.println("The sum of " + i1 + " and " + i2 +" is " + (i1+i2));
		

	}

}
