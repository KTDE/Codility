
package codility;

import java.util.Scanner;

public class codlityTest {
	
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner (System.in);
		System.out.println("Provide the test case: ");
		double A [] = new double [3];
		for (int i = 0; i<A.length;i++)
		{
			A[i] = scanner.nextDouble();
		}
		scanner.close();

		// int A [] = {1,2,3,4,2,3,1};
		System.out.println("The input array is: ");
		
		for (int i = 0; i<A.length; i++)
		{
			System.out.println(A[i]);
		}
		int valueE = solution (A);
		System.out.println("\nThe equilibrium value is: " + valueE);

	}
	
	public static int solution(double[] A)
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
//			System.out.println("leftSum value is: ");
//			System.out.println(leftSum);
			
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
//			System.out.println("rightSum value is: ");
//			System.out.println(rightSum);
			
			if (leftSum == rightSum)
			{
//				System.out.println(" This is equilibrium value: ");
//				System.out.println(p);
				equilibrium = p;
			}
//			else
//			{
//				equilibrium = -1;
//				System.out.println("There is no Equilibrium");
//			}
		
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
