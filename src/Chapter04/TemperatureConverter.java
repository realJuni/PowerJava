/*
	Title: PowerJava Chapter04 Programming04 - TemperatureConverter
	Author: Juni
	Purpose: convert the centigrade temperature into Fahrenheit
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter04;



import java.util.Scanner;





public class TemperatureConverter
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		double fahren;
		
		System.out.print("Input the Fahrenheit temperature: ");
		fahren = scan.nextDouble();
		
		System.out.println("The centrigrade temperatur: " + (5.0 / 9.0 * (fahren - 32)));
	} // method execute()
} // class