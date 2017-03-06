package codility;

public class leader {
	
		public static void main(String []args)
		{
			int [] A = {2,3,3,3,4,4,4,4,4};
			
			System.out.println("Leader is:" + solution(A));
		}
	    static int solution(int[] A) {
	        int n = A.length;
	        int[] L = new int[n + 1];
	        L[0] = -1;
	        for (int i = 0; i < n; i++) {
	            L[i + 1] = A[i];
	        }
	        int count = 0;
	        int pos = (n+1) / 2;
	        System.out.println("pos is:" + pos);
	        
	        int candidate = L[pos];
	        System.out.println("Candidate is: " + candidate);
	        for (int i = 1; i <= n; i++) {
	            if (L[i] == candidate)
	                count = count + 1;
	            System.out.println("count is: " + count);
	        }
	        if (((count > pos)&& (n%2)==0)|| ((count>=pos) && (n%2)==1))
	            return candidate;
	        return (-1);
	    }
	
}
