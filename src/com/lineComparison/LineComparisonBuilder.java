package com.lineComparison;

import java.util.Scanner;

public class LineComparisonBuilder {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation !!");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("plese Enter line co-ordinates x1=");
		int x1=sc.nextInt();
		System.out.print("plese Enter line co-ordinates x2=");
		int x2=sc.nextInt();
		System.out.print("plese Enter line co-ordinates y1=");
		int y1=sc.nextInt();
		System.out.print("plese Enter line co-ordinates x2=");
		int y2=sc.nextInt();
		double length_of_line=Math.sqrt((x2-x1)^2+(y2-y1)^2);
		sc.close();
		System.out.println("Length of The line is="+length_of_line);
		
	}

}
