package codility;

import java.util.Arrays;
import java.util.HashSet;

public class FrogRiverOne {
	public static void  main (String [] agrs)
	{
		int [] A = {1,4,2,1,3,4,5,4,1,5,5};
		System.out.println("Value of earliest moment is: " + solution (5, A));
	}
	
	public static int solution (int X, int [] A)
	{
		int earliestValue = -1;
		
		if (A.length < X)
			earliestValue = -1;
		else 
		{
			HashSet<Integer> set = new HashSet<>();
			for (int i = 0; i< A.length; i++)
			{
				set.add(A[i]);
				if (set.size() == X)
				{
				earliestValue = i;
				break;
				}
			}
		}
		return earliestValue;
	}
}