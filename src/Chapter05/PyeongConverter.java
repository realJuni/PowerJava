/*
	Title: PowerJava Chapter05 Programming07 - Pyeong Converter
	Author: Juni
	Purpose: convert pyeong into square meter
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;



public class PyeongConverter
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		double pyeong;
		
		System.out.print("Input the value as pyeong: ");
		pyeong = scan.nextDouble();
		System.out.println(pyeong + " pyeong is " + (pyeong * 3.3058) + " sqaure meter.");
	} // method execute()
} // class PyeongConverter