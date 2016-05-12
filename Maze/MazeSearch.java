
/**
 * Write a description of class MazeSearch here.
 * Print whether the program was able to solve the maze or if there was no solution.
 * @Jonathan Abood
 * @5/11/16
 */
public class MazeSearch
{
	public static void main()
	{
    	Maze labyrinth=new Maze();
   	 
    	System.out.println(labyrinth);
   	 
    	if (labyrinth.traverse(0,0))
    	System.out.println("The maze was successfully solved!");
   	 
    	else
    	System.out.println("There is no possible path.");
   	 
    	System.out.println(labyrinth);
	}
}
