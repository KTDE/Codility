
package codility;

import java.util.Scanner;

public class codlityTest {
	
	public int solution(double[] A)
	{	
		int equilibrium = -2;
		
		for (int p = 0; p < A.length ; p++)
		{
			double leftSum = 0;
			double rightSum = 0;
			
			if (p ==0)
			{
				leftSum = 0;
			}
			else 
			{
				for (int i = 0; i< p; i++)
				{
					leftSum = leftSum + A[i];
				}
			}
			
			if (p == A.length-1)
			{
				rightSum = 0;
			}
			else
			{
				for (int j = A.length-1 ; j> p; j--)
				{	
					rightSum =rightSum + A[j];
				}
			}
			
			if (leftSum == rightSum)
			{
				equilibrium = p;
			}
		}
		if (equilibrium == 2)
			{
			equilibrium = -1;
			return equilibrium;
			}
		else 
			return equilibrium;		
	}
}
