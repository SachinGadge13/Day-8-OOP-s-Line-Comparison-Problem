package com.bridgelabz.lineComparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program.");

		int x1, y1, x2, y2, x3, y3, x4, y4;

		double length1, length2; // to print decimal

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1");
		x1 = sc.nextInt();

		System.out.println("enter y1");
		y1 = sc.nextInt();

		System.out.println("enter x2");
		x2 = sc.nextInt();

		System.out.println("enter y2");
		y2 = sc.nextInt();

		System.out.println("enter x3");
		x3 = sc.nextInt();

		System.out.println("enter y3");
		y3 = sc.nextInt();

		System.out.println("enter x4");
		x4 = sc.nextInt();

		System.out.println("enter y4");
		y4 = sc.nextInt();

		length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
		length2 = Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);

		System.out.println("Length of the line (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + length1);
		System.out.println("Length of the line (" + x3 + ", " + y3 + ") and (" + x4 + ", " + y4 + ") is " + length2);
		if (length1 == length2)
			System.out.println("Both Line1 and Line2 are equal");
		else
			System.out.println("Both lines are not equal");
	}

}