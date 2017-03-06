package codility;

public class pitTriplet {
	
	public int solution (int [] A)
	{
		int n = A.length;
		int P = A[0];
		int Q = 0; 
		int R = 0;
		int deepest = 0;
		
		for (int i=1; i<n; i++)
		{
			if (A[i] >P)
				P = A[i];
			
			else if (P > A[i])
			{
				Q = A[i];
				for (int j=i; j<n; j++)
				{
					if (A[j] < Q)
						{Q = A [j];
						System.out.println("Q here is: " + Q);
						}
					else if(A[j] > Q)
					{
						R = A[j];
						int deep = Math.min((P-Q),(R-Q));
						deepest = Math.max(deepest, deep);
						
						for (int k = j+1; k<n; k++)
						{
							if (A[k] >R)
							R = A[k];
							deep = Math.min((P-Q),(R-Q));
							deepest = Math.max(deepest, deep);
						}
					}
				}
			}
			System.out.println("P:" + P + " Q:"+ Q + " R:" + R);
		}
		return deepest;
	}
}
