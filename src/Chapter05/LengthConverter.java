/*
	Title: PowerJava Chapter05 Programming03 - Length Converter from centi meter to inch
	Author: Juni
	Purpose: input centi meter length and convert the length into inch
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;





public class LengthConverter
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		double centi, inch;
		
		System.out.print("Input length in centi meter: ");
		centi = scan.nextDouble();
		
		inch = centi / 2.54;
		System.out.print(centi + " cm is " + (int)(inch / 12) + " feets and " + (inch % 12) + " inches.");
	} // method execute()
} // class LengthConverter