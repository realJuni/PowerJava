/*
	Title: PowerJava Chapter03 Lab03 - Diamond
	Author: Juni
	Purpose: print diamond composed by * on conosole
	Last Modified Date: 10. 16. 2017. DIM
 */





package Chapter03;





public class Diamond
{
	public void execute()
	{
		int lineNum = 8;
		
		
		
		for (int row = 0; row < lineNum; row++) // print each row in a iteration
		{
			// upper triangle
			if(row < lineNum / 2) // from first line to the half of whole line
			{
				for (int blank = 0; blank < (lineNum / 2) - row - 1; blank++) // print blank for each line
				{
					System.out.print(" ");
				}
				
				for (int star = 0; star < 2 * row + 1; star++)
				{
					System.out.print("*");
				}
			} // if(row)
			
			// downer triangle
			else // from half of whole line to last line
			{
				for (int blank = 0; blank < row - (lineNum / 2) + 1; blank++)
				{
					System.out.print(" ");
				}
				
				for (int star = 0; star < (lineNum - row - 1) * 2 - 1; star++)
				{
					System.out.print("*");
				}
			} // if(row)
			
			System.out.println(); // new line
		} // for each row
	} // method draw()
} // class Diamond
