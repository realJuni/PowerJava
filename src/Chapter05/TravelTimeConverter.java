/*
	Title: PowerJava Chapter05 Programming08 - Travel Time Converter
	Author: Juni
	Purpose: compute traveling time of light between the earth and the sun
	Last Modified Date: 10. 16. 2017. LUN
 */





package Chapter05;



import java.util.Scanner;





public class TravelTimeConverter
{
	public void execute()
	{
		double velocity = 299792458.0; // meter per second
		double distance = 149597870700.0;
		double timeSec = distance / velocity;
		double timeMin = timeSec / 60;
		
		System.out.printf("The traveling time of light is %e seconds, %e minutes", timeSec, timeMin);
	} // method execute()
} // class TravelTimeConvereter