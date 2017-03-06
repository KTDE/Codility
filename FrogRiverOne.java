package codility;

import java.util.Arrays;
import java.util.HashSet;

public class FrogRiverOne {
	
	public int solution (int X, int [] A)
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
