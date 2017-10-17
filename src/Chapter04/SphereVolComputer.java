/*
	Title: PowerJava Chapter04 Programming03 - Volume Computer
	Author: Juni
	Purpose: compute volume of a sphere
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter04;


import java.util.Scanner;





public class SphereVolComputer
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		double radius;
		
		System.out.print("Input radius: ");
		radius = scan.nextDouble();
		
		System.out.println("The volume of the sphere: " + (radius * radius * radius * 4 / 3));
	} // method execute()
} // class SphereVolComputer