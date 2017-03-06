package codility;

import java.util.ArrayList;
import java.util.Scanner;


public class BinaryGap {

	public static void main(String [] agrs)
	{
		System.out.println("Provide an Integer number ");
		Scanner scanner = new Scanner (System.in);
		int N = scanner.nextInt();
		scanner.close();
		System.out.println("Binary form" + DecimalToBinary(N));
		int binaryGap = solution(N);
		System.out.println("largest binary gap is: " + binaryGap);
	}
	
	public static int solution(int N)
	{
		ArrayList<Integer> binary = DecimalToBinary(N);
		int counter = 0;
		int gap = 0;
		int i = 0;
		
		// remove zeros at the beginning
		while (binary.get(i)==0)
		{
			i ++;
		}
		
		for (; i < binary.size(); i++)
		{	
			System.out.println("iteration: " + i);
			if (binary.get(i) == 1)		
			{
				gap = Math.max(gap, counter);
				counter = 0;
			}
			else 
			{
				counter ++;
			}
		}
		return gap;
	}
	
	// convert decimal to binary
	public static ArrayList<Integer> DecimalToBinary (int N)
	{
		ArrayList<Integer> arl = new ArrayList<Integer> ();
		
		while (N > 0)
		{
			int a = (int) N/2;
			int b = N % 2;
			arl.add(b);
			b = a;
			N = a; 
		}
		return arl;
	}	
}
