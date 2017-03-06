package codility;

public class PassingCars {
	
	public int solution (int [] A)
	{
		int n = A.length;
		int pref_sum_A = 0;
		int pref_sum = 0;
		int passingCars = 0;
		
		for (int i = 0; i < n; i++)
			pref_sum_A += A[i];
		//	System.out.println(pref_sum_A);
		
		for (int j = 0; j < n; j++)
		{
			pref_sum += A[j];
		//	System.out.println(pref_sum);
			if (A[j] == 0)
			passingCars += pref_sum_A - pref_sum;
		}
		if (passingCars > 1000000000)
			passingCars = -1;
		
		return passingCars;
	}
}
