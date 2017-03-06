package codility;

import java.util.Arrays;

public class PermCheck {
	
	public int solution (int [] A)
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
