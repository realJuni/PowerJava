/*
	Title: PowerJava Chapter05 Programming09 - Pressure Computer
	Author: Juni
	Purpose: compute pressure
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;





public class PressureComputer
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		double force, area;
		
		System.out.print("Input the force: ");
		force = scan.nextDouble();
		System.out.print("Input the area: ");
		area = scan.nextDouble();
		
		System.out.println("The pressure value is " + (force / area));
	} // method execute()
} // class PressureComptuer