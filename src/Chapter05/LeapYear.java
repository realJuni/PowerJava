/*
	Title: PowerJava Chapter05 Lab01 - Leap Year Decider
	Author: Juni
	Purpose: decide the input year is leap year or not
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;





public class LeapYear
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		int year;
		boolean isLeapyear;
		
		System.out.print("Input the target year: ");
		year = scan.nextInt();
		
		isLeapyear = ((year % 4) == 0 && (year % 100) != 0) || ((year % 400) == 0);
		
		System.out.println("Is it a leap year?: " + isLeapyear);
	} // method execute()
} // class LeapYear