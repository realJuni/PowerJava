/*
	Title: PowerJava Chapter05 Progarmming01 - Name and Age Printer
	Author: Juni
	Purpose: input name and age, and print it on console
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;





public class PrivacyPrinter
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("Input the name: ");
		name = scan.nextLine();
		System.out.print("Input the age: ");
		age = scan.nextInt();
		
		System.out.println("The name is " + name +", and the age is " + age);
	} // method execute()
} // class PrivacyPrinter