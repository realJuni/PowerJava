/*
	Title: PowerJava Chapter06 Exercise06 - Print Third Value
	Author: Juni
	Purpose: answer sheet of exercise 06
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter06;



import java.util.Scanner;





public class PrintThirdValue
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in); // Scanner instance to read from user through console
		int x; // store input value
		
		// input from standard input
		System.out.print("Input value: ");
		x = scan.nextInt();
		
		if(x >= 0) // if x is 0 or larger than 0
		{
			if(x == 0) // if x is 0
			{
				System.out.println("first");
			}
			// if x is larger than 0, nothing is happened
		}
		else // if x is smaller than 0
		{
			System.out.println("third");
		}
	} // method execute()
} // class PrintThridValue