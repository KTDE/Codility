package codility;

public class PermMissingElem {
	
	public int solution(int[] A)
	{
		int N = A.length;
		int sum = 0;
		int sumA = 0;
		for (int i = 0; i <N +1; i++)
		{
			sum += i+1;
			if (i < N)
			sumA += A[i];
		}
		return sum -sumA;
	}

}
