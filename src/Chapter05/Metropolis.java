/*
	Title: PowerJava Chapter05 Lab01 - Metropolis
	Author: Juni
	Purpose: decide whether the city what has input condition is a metropolis or not
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;





public class Metropolis
{
	public void execute()
	{
		boolean isCapital;
		int citizens, riches;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Is the city a capital? (Yes: 1, No: 0): ");
		isCapital = (scan.nextInt() == 1) ? true : false;
		System.out.print("Population (unit: ten thousand): ");
		citizens = scan.nextInt();
		System.out.print("The number of riches (unit: ten thousand): ");
		riches = scan.nextInt();
		
		boolean isMetro = (isCapital && citizens >= 100) || (riches >= 50);
		
		System.out.println("Is it a metropolis?: " + isMetro);
	} // method execute()
} // class Metropolis