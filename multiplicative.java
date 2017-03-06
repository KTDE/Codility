package codility;

import java.util.Arrays;

public class multiplicative {
	public static void main (String [] agrs)
	{
		double [] A = {1,1,2,3};
		double [] B = {500000, 1000000, 1000000,500000};
		System.out.println("number multiple: " + solution (A,B));
	}
	public static int solution(double[] A, double[] B) 
	{
		int n = A.length;
		double [] C = new double [n];
		C[0] =0;
		int count = 0;
		for (int i = 0; i <n; i++)
		{
			C[i] = A[i] + B[i]/1000000;
		}
		Arrays.sort(C);
		
		for (double i:C)
		System.out.println("C is" + C[(int) i]);
		
		for (int j = 0; j <n; j++)
		{
			double temp = C[j];
			for (int k = j+1; k<n; k++)
			{
				if (temp*C[k] >= temp +C[k])
					count ++;
			}
		}
		if (count < 1000000000)
		return count;
		else 
			return 1000000000;
	}
}
