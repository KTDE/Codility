package codility;

public class CyclicRotation {
	
	 public int[] solution(int[] A, int K)
	 {
		 if(A.length == 0 || A.length ==1 || K ==0)
			 return A;
		 else
		 {
			 int []A1 = new int [A.length];
//		 for (int i:A1)
//				System.out.println(i);
		 
			 while (K >0)
			 {
			// System.out.println("Number iteration: " + K);
				 A1 [0] = A[A.length-1];
			 
				 for (int i = 0; i< A.length-1; i++)
				 {
			//	 System.out.println("A[i] is: " + A[i]);
					 A1[i+1] = A[i];
			//	 System.out.println("i = " + i);
				 }
				 for (int i =0; i < A.length; i++)
				 {
					 A[i] = A1[i];
				 }
				 K--; 
			 }
			 return A;
		 }		
	 }
