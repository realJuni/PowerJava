/*
	Title: PowerJava Chapter04 Lab01 - Box
	Author: Juni
	Purpose: challenge
	Last Modified Date: 10. 16. 2017. DIM
 */





package Chapter04;

import java.util.Scanner;





public class Box
{
	public void execute()
	{
		double w, h, area, perimeter;
		Scanner scan = new Scanner(System.in); // System.in is standard input
		
		System.out.print("Input the width: ");
		w = scan.nextDouble(); // scan the line from console, store its value as double
		
		System.out.print("Input the height: ");
		h = scan.nextDouble(); // scan the line from console, store its value as double
		
		area = w * h;
		perimeter = 2 * (w + h);
		
		System.out.println("Area of the box: " + area + "\nPerimeter of the box: " + perimeter); // the "\n" is the caarriage return
	} // method execute()
} // class Box