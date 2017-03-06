package codility;

public class OddOccurencesInArray {
	 
	public static void main (String [] agrs)
	{
		int [] A = {1, 7, 3,7,1,1,1};
		System.out.println("Unpaired number is: " + solution(A));
	}
	
	public static int solution(int[] A)
	 {
		int unpairedIndex = 0;
		int counter = 0;
		
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j<A.length; j++)
			{
				if (A[j] == A[i])
					counter ++;
			}
			if (counter % 2 == 1)
			{
				unpairedIndex = i;
				counter = 0;
			}
			else 
				counter = 0;
		}
		 return A[unpairedIndex];
	 }
}
