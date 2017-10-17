/*
	Title: PowerJava Chapter06 Lab - Pi Calculator
	Author: Juni
	Purpose: compute pi value by using infinite series
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter06;



import java.util.Scanner;





public class CalPi
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		double divisor, divident, sum;
		int loopCount;
		
		divisor = 2.0;
		divident = 4.0;
		sum = 3.0;
		
		System.out.print("The number of iterations: ");
		loopCount = scan.nextInt();
		
		while(loopCount > 0)
		{
			System.out.println("Pi = " + sum);
			System.out.println("New added factor: " + divident + " / " +"( "
					+ divisor + " * " + (divisor + 1) + " * " + (divisor + 2) + ")");
			sum += divident / (divisor * (divisor + 1) * (divisor + 2));
			divident *= -1.0;
			divisor++;
			loopCount--;
		} // while(looopCount)
		
//		System.out.println("Pi = " + sum);
	} // method execute()
} // class CalPi