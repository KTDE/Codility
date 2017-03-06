package codility;

import java.util.Scanner;

public class Fibonacci {

	public static void main (String [] args)
	{
		System.out.println ("Provide n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		Fib(n);
	}
	public static void Fib(int n)
	{
		int a = 0;
		int b = 1;
		System.out.println ("The Fibonacci for n = "+ n);
		while (a <= n)
		{
			System.out.println(a +" ");
			int c = a + b;
			a = b;
			b = c;
		}
	}
}
