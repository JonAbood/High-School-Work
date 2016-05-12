
/**
 * This program simulates the classic carnival game BumperCars. The program asks you how many cars 
 * you'd like to play with. It will then put that many bumber cars in the game. Then the program 
 * asks you to enter either Y or N to continue or stop. If you hit Y it will randomly move each car and 
 * if they collide, change direction. The program will record every interaction between the bumper cars.
 * If you hit N, then the program will stop, and it will print out how many times each bumper car hit and
 * the average hits for all the cars added up.
 * 
 * @Jonathan Abood
 * @5/11/16
 */
import javax.swing.JOptionPane;
import java.util.Scanner;


public class BumperCarSimulation
{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[]args)
	{
    	System.out.println("Bumper Car Simulation");
    	int ew = 10;
    	int ns = 10;
    	int numCars = 0;
    	boolean badInput = true;
   	 
   	 
    	while (badInput)
    	{
        	System.out.println("How many cars?");
        	numCars = scan.nextInt();
        	//System.out.println("Size of the arena's north-south" + "dimension?");
       	 
        	//ns = scan.nextInt();
       	 
        	if (numCars>ew*ns)
        	{
            	System.out.println("Too many cars to fit in that " + "size arena!");
            	System.out.println("Please enter the information " + "again:");
        	}
        	else if (numCars <= 0)
        	{
            	System.out.println("The number of cars must be greater" + " than 0!");
            	System.out.println("Please enter the information " + "again:");
        	}
        	else
            	badInput = false;
        	}
       	 
        	Arena arena = new Arena(ns, ew);
        	Simulation sim = new Simulation(numCars, arena);
       	 
        	int iterations = 0;
        	String keepGoing;
        	arena.printArena();
        	keepGoing=JOptionPane.showInputDialog("Keep going? Type 'y' for yes or 'n' for" + " no.");
        	while (keepGoing.equalsIgnoreCase("y"))
        	{
            	sim.step();
            	iterations++;
            	arena.printArena();
            	keepGoing=JOptionPane.showInputDialog("Keep going? Type 'y' for yes or 'n' for" + " no.");
        	}
       	 
        	System.out.println("Number of iteration: " + iterations);
        	sim.printBumpCounts();
    	}
	}


