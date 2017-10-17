/*
	Title: PowerJava Chapter04 Programming01 - Distance Converter
	Author: Juni
	Purpose: convert the distance from miles to killo meters
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter04;




import java.util.Scanner;





public class DistanceConverter
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		double dist;
		
		
		
		System.out.print("Input the distance (miles): ");
		dist = scan.nextDouble(); // scan double type value from console
		
		System.out.println(dist + " miles is " + (dist * 1.609) + " killo meters.");
	} // method execute()
} // class DistanceConverter