/*
	Title: PowerJava Chapter05 Programming02 - Devider
	Author: Juni
	Purpose: input two integers, show the quotient and remainder
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;





public class Devider
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		int firstValue, secondValue, quotient, remainder;
		
		System.out.print("Input a integer: ");
		firstValue = scan.nextInt();
		System.out.print("Input a integer: ");
		secondValue = scan.nextInt();
		
		quotient = (firstValue > secondValue) ? firstValue / secondValue : secondValue / firstValue;
		remainder = (firstValue > secondValue) ? firstValue % secondValue : secondValue % firstValue;
		
		System.out.println("The quotient: " + quotient);
		System.out.println("The remainder: " + remainder);
	} // method execute()
} // class Devider