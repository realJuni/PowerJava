/*
	Title: PowerJava Chapter05 Programming10 - Similar Figure Computer
	Author: Juni
	Purpose: compute length of a line of similar triangle
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;





public class SimilarFigureComputer
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		double baseLineSmall, heightSmall, baseLineLarge;
		
		System.out.print("Input base line of small triangle: ");
		baseLineSmall = scan.nextDouble();
		System.out.print("Input height of small triangle: ");
		heightSmall = scan.nextDouble();
		System.out.print("Input base line of large triangle: ");
		baseLineLarge = scan.nextDouble();
		
		System.out.println("The height of large triangle: " + (heightSmall * baseLineLarge / baseLineSmall));
	} // method execute()
} // class SimilarFigureComptuer