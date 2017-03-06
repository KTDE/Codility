package codility;

import java.util.Scanner;

public class Fibonacci {

	public void Fib(int n)
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
