package com.bridgelabz.lineComparison;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program.");
		
		int x1 = 5, x2 = 100, y1 = 15, y2 = 200;
		int length = (int) Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2); //formula to cal length co-ordinates , 
		
		System.out.println("Length of the line (" + x1 + ", " + x2 + ") and (" + y1 + ", " + y2 + ") is " + length);
	}

}