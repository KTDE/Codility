package codility;

public class FrogJmp {
	public static void main (String [] agrs)
	{
		System.out.println("number jumps is: " + solution(10,81,30));
	}
	
	public static double solution (int X, int Y, int D)
	{
	//	int jumps = (int)(Math.ceil((double)(Y - X) / (double)( D)));
		int jumps = (Y-X + (D-1))/D;
		return jumps;
	}
}
