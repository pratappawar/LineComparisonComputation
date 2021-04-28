package com.lineComparison;

import java.util.Scanner;

public class LineComparisonBuilder {

	public static void main(String[] args) {

		System.out.println("Welcome to line comparison computation problem!!");

		LineComputation lc = new LineComputation();
		lc.lineComputationEquality();

	}
}

class LineComputation {

	public void lineComputationEquality() {
		Scanner sc = new Scanner(System.in);
		System.out.print("plese Enter line co-ordinates x1=");
		int x1 = sc.nextInt();
		System.out.print("plese Enter line co-ordinates x2=");
		int x2 = sc.nextInt();
		System.out.print("plese Enter line co-ordinates y1=");
		int y1 = sc.nextInt();
		System.out.print("plese Enter line co-ordinates x2=");
		int y2 = sc.nextInt();
		int length_of_line1 = (int) (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		int line1_length = (int) Math.sqrt(length_of_line1);

		System.out.println("Length of The line1 is=" + line1_length);

		System.out.print("plese Enter line co-ordinates x3=");
		int x3 = sc.nextInt();
		System.out.print("plese Enter line co-ordinates x4=");
		int x4 = sc.nextInt();
		System.out.print("plese Enter line co-ordinates y3=");
		int y3 = sc.nextInt();
		System.out.print("plese Enter line co-ordinates y4=");
		int y4 = sc.nextInt();
		int length_of_line2 = (int) (((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
		int line2_length = (int) Math.sqrt(length_of_line2);
		sc.close();
		System.out.println("Length of The line2 is=" + line2_length);

		Integer L1 = new Integer(line1_length);
		Integer L2 = new Integer(line2_length);
		// Using Equal Method

		if (L1.equals(L2)) {
			System.out.println("Both lines are equal");
		} else {
			System.out.println("Both lines are not equal");
		}

		// Using CompareTo method

		int eq = L1.compareTo(L2);
		System.out.println(eq);
		if (eq == 0) {
			System.out.println("Bothe lines are Equal ");
		} else if (eq > 0) {
			System.out.println("Line1 is Greater Than Line 2");
		} else {
			System.out.println("Line2 is Greater than Line1");
		}

	}

}