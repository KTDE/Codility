package codility;

public class NumberDiv {
	
	public int solution (int A, int B, int K)
	{
		// (A-1)/K is the sum of all the occurrences of the numbers <=(A-1) that are divisible by K.
		// B/K is the sum of all the occurrences of the numbers <= B that are divisible by K.
	
		return ((B/K) - (A-1)/K);
	}
}
