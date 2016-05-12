
/**
 * Write a description of class Rock_Paper_Scissors here.
 * Simulates a game of rock, paper, scissors. Asks the user to pick 1 of the 3 options, and randomly
 * generates the computers choice. After you pick it will print what the computer got, followed by
 * whether you won, lost, or tied. Then the program asks the user whether or not they what to continue
 * if so, continue the steps above, otherwise print the record of the user(wins, loses and ties)
 * @Jonathan Abood
 * @5/11/16
 */
import java.util.Scanner;
public class RockPaperScissors
 {
 	public static void main (String[]args)
 	{
     	Scanner scan=new Scanner (System.in);
     	String cont="y", winplur="s", lossplur="s", tieplur="s", wereplur="were";
     	int wins=0, losses=0, ties=0, ran=0;
     	String comp="", play="";
     	while (cont.equalsIgnoreCase("y"))
     	{
        	play="";
        	ran=0+(int)(Math.random()*(3));
        	if (ran==0)
        	{
            	comp="rock";
        	}
        	if (ran==1)
        	{
            	comp="scissors";
        	}
        	if (ran==2)
        	{
            	comp="paper";
        	}
        	while (!(play.equalsIgnoreCase("r")||play.equalsIgnoreCase("p")||play.equalsIgnoreCase("s")))
        	{
            	System.out.println("Enter R (rock), P (paper) or S (scissors)");
            	play=scan.nextLine();
            	if (!(play.equalsIgnoreCase("r")||play.equalsIgnoreCase("p")||play.equalsIgnoreCase("s")))
            	{
                	System.out.println("That is not one of the valid answers!");
            	}
        	}
        	if (play.equalsIgnoreCase("r"))
        	{
            	play="rock";
        	}
        	if (play.equalsIgnoreCase("p"))
        	{
            	play="paper";
        	}
        	if (play.equalsIgnoreCase("s"))
        	{
            	play="scissors";
        	}
        	if (play.equalsIgnoreCase(comp))
        	{
            	System.out.println("Computer chose "+comp+", also. It's a tie!");
            	ties++;
        	}
        	else if ((play.equalsIgnoreCase("rock")&&comp=="scissors")||(play.equalsIgnoreCase("scissors")&&comp=="paper")||(play.equalsIgnoreCase("paper")&&comp=="rock"))
        	{
            	System.out.println("Computer chose "+comp+". So you win!");
            	wins++;
        	}
        	else if ((play.equalsIgnoreCase("scissors")&&comp=="rock")||(play.equalsIgnoreCase("paper")&&comp=="scissors")||(play.equalsIgnoreCase("rock")&&comp=="paper"))
        	{
            	System.out.println("Computer chose "+comp+". "+comp+" beats "+play+". You lose!");
            	losses++;
        	}
        	cont="";
        	while (!(cont.equalsIgnoreCase("y")||cont.equalsIgnoreCase("n")))
        	{
            	System.out.println("Do you want to play again? Enter \"y\" or \"n\"");
            	cont=scan.nextLine();
            	if (!(cont.equalsIgnoreCase("y")||cont.equalsIgnoreCase("n")))
            	{
                	System.out.println("That is not one of the valid answers!");
            	}
        	}
    	}
    	if (wins==1)
    	{
        	winplur="";
    	}
    	if (losses==1)
    	{
        	lossplur="";
    	}
    	if (ties==1)
    	{
        	tieplur="";
        	wereplur="was";
    	}
    	System.out.println("You won "+wins+" time"+winplur+" and lost "+losses+" time"+lossplur+". There "+wereplur+" "+ties+" tie"+tieplur+".");
 	}
 }
