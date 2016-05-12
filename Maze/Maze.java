
/**
 * Write a description of class Maze here.
 * The program goes through this 2D array that is the "maze". It will travel along the 1s trying to
 * solve the maze! As it travels it will switch the 1s to 7s so the user can see the sucessful path.
 * If it finds a dead end it will turn around and also flip all the 1s to 3s so you can see the paths
 * it attempted but failed.
 * @Jonathan Abood
 * @5/11/16
 */
public class Maze
{
	private final int TRIED=3;
	private final int PATH=7;
    
	private int[][] grid={{1,1,1,0,1,1,0,0,0,1,1,1,1},
    	{1,0,1,1,1,0,1,1,1,1,0,0,1},
    	{0,0,0,0,1,0,1,0,1,0,1,0,0},
    	{1,1,1,0,1,1,1,0,1,0,1,1,1},
    	{1,0,1,0,0,0,0,1,1,1,0,0,1},
    	{1,0,1,1,1,1,1,1,0,1,1,1,1},
    	{1,0,0,0,0,0,0,0,0,0,0,0,0},
    	{1,1,1,1,1,1,1,1,1,1,1,1,1}};
   	 
	public boolean traverse(int row, int column)
	{
    	boolean done=false;
   	 
    	if (valid (row, column))
    	{
        	grid[row][column]=TRIED;
       	 
        	if (row==grid.length-1&&column==grid[0].length-1)
        	{
            	done=true;
        	}
        	else
        	{
            	done=traverse(row+1,column);
            	if (!done)
            	{
                	done=traverse(row, column+1);
            	}
            	if (!done)
            	{
                	done=traverse(row-1, column);
            	}
            	if (!done)
            	{
                	done=traverse(row, column-1);
            	}
        	}
        	if (done)
        	{
            	grid[row][column]=PATH;
        	}
    	}
    	return done;
	}
    
	private boolean valid(int row, int column)
	{
    	boolean result=false;
   	 
    	if (row>=0&&row<grid.length&&column>=0&&column<grid[row].length)
    	{
        	if (grid[row][column]==1)
        	{
            	result=true;
        	}
    	}
    	return result;
	}
    
	public String toString()
	{
    	String result="\n";
   	 
    	for (int row=0; row<grid.length; row++)
    	{
        	for (int column=0;column<grid[row].length; column++)
        	{
            	result+=grid[row][column]+" ";
        	}
        	result+="\n";
    	}
    	return result;
	}
}
