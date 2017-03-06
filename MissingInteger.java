package codility;

public class MissingInteger {

	public int solution(int [] A)
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
