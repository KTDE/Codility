package codility;

public class TapeEquilibrium {
	
	 public int solution(int[] A) {
	        // write your code in Java SE 8
			int sum = 0;	
			int leftSum = 0;
			for (int i=0; i<A.length;i++)
			{
				sum += A[i]; 
			}
		//	System.out.println(sum);
			int minDiff = 10000000;
			for (int j=1; j <A.length ; j++)
			{
				leftSum += A[j-1];				
//				for(int l = 0 ; l<j; l++)
//				{
//					leftSum += A[l]; 	
//				}
				System.out.println("leftSum = " + leftSum);
			int	Diff = Math.abs(sum -2*leftSum);
			minDiff =  Math.min(minDiff, Diff);
			//leftSum = 0;
			}
			return minDiff;
		}

}
