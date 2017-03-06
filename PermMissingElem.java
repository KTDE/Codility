package codility;

public class PermMissingElem {
	public static void main (String [] agrs)
	{
		int [] A = {1,2,3,5,6};
		System.out.println("missing value = " + solution(A));
	}
	
	public static int solution(int[] A)
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
