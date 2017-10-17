/*
	Title: PowerJava Chapter06 Exercise05 - Compute Sigma Value
	Author: Juni
	Purpose: compute sigma (i^2 + 1) from 1 to 30
	Last Modified Date: 10. 16. 2017. LUN
	Note: first expression is i^2 + 1 (i: from 1 to 30)
		second expression is i * j (i: from 10 to 30, j: from 0 to 5)
 */





package Chapter06;





public class ComputeSigma
{
	public void execute()
	{
		int sum = 0;
		
		for (int i = 10; i < 31; i++) // first expression: initial i value is 1
		{
//			sum += i * i + 1; // for first expression
			for (int j = 0; j < 6; j++)
			{
				sum += i * j;
			} // for j
		} // for i
		
		System.out.println("Result: " + sum);
	} // method execute()
} // class ComputeSigma