package com.bridgelabz.lineComparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		calculateTwoLength();
		checkingEqualsLine(0, 0);
	}

	public static void calculateTwoLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a1 point : ");
		int a1 = sc.nextInt();
		System.out.println("Enter a2 point : ");
		int a2 = sc.nextInt();
		System.out.println("Enter b1 point : ");
		int b1 = sc.nextInt();
		System.out.println("Enter b2 point : ");
		int b2 = sc.nextInt();

		System.out.println("Enter x1 point : ");
		int x1 = sc.nextInt();
		System.out.println("Enter x2 point : ");
		int x2 = sc.nextInt();
		System.out.println("Enter y1 point : ");
		int y1 = sc.nextInt();
		System.out.println("Enter y2 point : ");
		int y2 = sc.nextInt();
		sc.close();

		double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of the line 1 is: " + length1);

		double length2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("Length of the line 2 is: " + length2);
	}

	public static void checkingEqualsLine(double length1, double length2) {
		int a = (int) length1;
		int b = (int) length2;

		if (a == b) {
			System.out.println("Lines are equal");
		} else {
			System.out.println("Lines are not equal");
		}
		System.out.println(Double.compare(length1, length2));
	}
}