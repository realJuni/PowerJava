/*
	Title: Main Driver for Power Java
	Author: Juni
	Purpose: run each class
 */





package driver;



import Chapter03.Diamond;
import Chapter04.Box;
import Chapter04.DistanceComputer;
import Chapter04.DistanceConverter;
import Chapter04.PriceComputer;
import Chapter04.SphereVolComputer;
import Chapter04.TemperatureConverter;





public class MainDriver
{
	public static void main(String args[])
	{
		Diamond dia = new Diamond();
		Box box = new Box();
		DistanceComputer distCom = new DistanceComputer();
		DistanceConverter distCon = new DistanceConverter();
		PriceComputer priceCom = new PriceComputer();
		SphereVolComputer sphrVolCom = new SphereVolComputer();
		TemperatureConverter temperCon = new TemperatureConverter();
		
		temperCon.execute();
	} // method main()
} // class MainDriver