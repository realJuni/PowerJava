/*
	Title: PowerJava Chapter05 Programming05 - Box Volume Computer
	Author: Juni
	Purpose: input size of box and compute volume of the box
	Last Modified Date: 10. 16. 2017. LUN
	Note: minimize the size of using memory
 */





package Chapter05;



import java.util.Scanner;





public class BoxVolumeComputer
{
	public void execute()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the length of edges: "); // show input message
		// print method is executed after read from standard input when the scan instance is used
		System.out.println("Volume of the box: " + (scan.nextInt() * scan.nextInt() * scan.nextInt()));
	} // method execute()
} // class BoxVolumeComputer