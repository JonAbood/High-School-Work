
/**
 * Write a description of class NonAttackingQueens here.
 * This is a solution to -----> "Write a recursive solution to the NonAttackingQueens problem. 
 * How can 8 queens be positioned on an 8 by 8 chessboard so thate none of them are in the 
 * same row, column or diagonal as any other queen? There are no other chess peices on the board."
 * @Jonathan Abood
 * @5/11/16
 */




public class NonAttackingQueens
{
	private int[] queens;
	private static final int NUMQUEENS=8;
	private static int numSolution=1;
	public NonAttackingQueens()
	{
	queens=new int[NUMQUEENS];
	}
	private boolean canPlace(int queenNumber, int col)
	{
	for (int row=0;row<queenNumber;row++)
	{
    	if (queens[row]==col)
        	return false;
    	if (Math.abs(queens[row]-col)==Math.abs(row-queenNumber))
        	return false;
	}
	return true;
	}
	private void solve(int queenNumber)
	{
	for (int col=0;col<NUMQUEENS;col++)
	{
    	if (canPlace(queenNumber,col))
    	{
        	queens[queenNumber]=col;
        	if (queenNumber==7)
        	{
            	printSolution();
        	}
        	else
        	{
            	solve(queenNumber+1);
        	}
    	}
	}
	}
	private void printSolution()
	{
	System.out.println("Solution Number: "+numSolution);
	for (int row=0;row<NUMQUEENS; row++)
	{
    	for (int col=0;col<NUMQUEENS;col++)
    	{
        	if (queens[row]==col)
            	System.out.print(" X");
        	else
            	System.out.print(" 0");
    	}
    	System.out.println();
	}
	System.out.println("=========================================================");
	numSolution++;
	}
   	
	public static void main()
	{
	NonAttackingQueens thing=new NonAttackingQueens();
	thing.solve(0);
	}
}
