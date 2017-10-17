/*
	Title: PowerJava Chapter05 Programming04 - Cylinder Volume Computer
	Author: Juni
	Purpose: input is the radius of base side and the height and compute the volume of the cylinder
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;





public class CylinderComputer
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		double radius, height;
		
		System.out.print("Input the raidus: ");
		radius = scan.nextDouble();
		System.out.print("Input the height: ");
		height = scan.nextDouble();
		
		System.out.println("The volume of the cylinder is " + (3.14 * radius * radius * height));
	} // method execute()
} // class CylinderComputer