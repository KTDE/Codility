package codility;

public class FrogJmp {
	
	public double solution (int X, int Y, int D)
	{
	//	int jumps = (int)(Math.ceil((double)(Y - X) / (double)( D)));
		int jumps = (Y-X + (D-1))/D;
		return jumps;
	}
}
