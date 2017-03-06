package codility;

import java.util.Arrays;

public class PermCheck {
	public static void main (String [] agrs)
	{
		int [] A = {5,1,2};
		int binary = solution(A);
		if (binary == 1)
			System.out.println("THis array is permuation");
		else 
			System.out.println("This array is not permutation");
	}
	
	public static int solution (int [] A)
	{
		Arrays.sort(A);
		int result = 1;
		for (int i = 1; i <= A.length; i++)
		{
			if (Arrays.binarySearch(A, i) <0)
				{
					result = 0;
					break;
				}
		}
		return result;
	}
}
