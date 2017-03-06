package codility;

public class MissingInteger {

	public static void  main (String [] agrs)
	{
		int [] A = {-1,1,1,2,2,2,2,3,3,4,45,5, 2147483647};
		System.out.println("Missing Value is " + solution(A));
	}
	public static int solution(int [] A)
	{
		int n = A.length;
		int [] count = new int [2147483647];
		
		for (int i:count)
		count[i] = 0;
		
		for (int k =0; k<n;k++)
		{
			if(A[k]>=0)
			count[A[k]] += 1;
		//	System.out.println("count[" + A[k] + "]:" + count[A[k]] );
		}
		int j = 1;
		while (count[j]!=0)
		{
			j++;
		}
		
		return j;
	}
}
