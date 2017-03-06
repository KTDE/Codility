package codility;

import java.util.Arrays;

public class multiplicative {
	
	public int solution(double[] A, double[] B) 
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
