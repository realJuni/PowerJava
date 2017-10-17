/*
	Title: PowerJava Chapter05 Programming06 - Peny Computer
	Author: Juni
	Purpose: input the number of pennies and compute the total amount of money
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;





public class PenyComputer
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		int numFiv, numOneHund, numFif, numTen;
		
		System.out.print("Input the number of 500 won coins: ");
		numFiv = scan.nextInt();
		System.out.print("Input the number of 100 won coins: ");
		numOneHund = scan.nextInt();
		System.out.print("Input the number of 50 won coins: ");
		numFif = scan.nextInt();
		System.out.print("Input the number of 10 won coins: ");
		numTen = scan.nextInt();
		
		System.out.println("The total amount of money: " + (500 * numFiv + 100 * numOneHund + 50 * numFif + numTen * 10));
	} // method execute()
} // class PenyComputer