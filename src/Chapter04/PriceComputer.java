/*
	Title: PowerJava Chapter04 Programming02 - Price Computer
	Author: Juni
	Purpose: input moeny and price, compute and show tax and the change
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter04;



import java.util.Scanner;





public class PriceComputer
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		double money, price;
		
		System.out.print("Money received: ");
		money = scan.nextDouble();
		System.out.print("Total price: ");
		price = scan.nextDouble();
		System.out.println("Tax: " + (price * 0.1));
		System.out.println("Change: " + (money - (price * 1.1)));
	} // method execute()
} // class PriceComputer