
/**
 * Write a description of class GuessingGame here.
 * This is guessing game! The game works as such: The program will ask you to enter a number between 1 
 * and 100. The program will say, too low(you must guess higher) too high(you must guess lower) or 
 * congradulations you guess the number. Once you guess the number, the program will prints that you 
 * won followed by the number of guesses it took
 * @Jonathan Abood
 * @5/11/16
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class GuessingGame
{
	final static int TOOHIGH=100;
	final static int TOOLOW=1;
	public static void main(String[]args)
	{
    	//create the decimal format!!!
    	DecimalFormat output=new DecimalFormat("0.00");
    	//create vars for random, number and guess
    	int random=0, number=0, guess=0;
    	String answer;
    	//randomly decide a number
    	random=1+(int)(Math.random()*(100-1+1));
    	//while your answer is not eqaul to random
    	while (number<random||number>random)
        	{
            	//display question box that asks you to guess a number from 1 to 100
            	number=getguess();
            	//if the answer is greater than the random number
            	respond(random, number);
            	guess++;
            	//add 1 to guess
        	}
        	//display final answer saying "Congradulations, it took you "+guess+" guesses."
    	answer="Congradulations, it took you "+guess+" guesses.";
    	JOptionPane.showMessageDialog(null,answer);
	}
	public static int getguess()
	{
    	int number=0;
    	String answer;
    	while (number<TOOLOW||number>TOOHIGH)
    	{
        	answer=JOptionPane.showInputDialog("Enter a number from 1 to 100");
        	number=Integer.parseInt(answer);
    	}
    	return number;
	}
	public static void respond(int random, int number)
	{
    	String answer;
    	//if the answer is greater than the random number
    	if (number>random)
    	{
               	 
        	//display box saying "too high"finalanswer="Too high";
        	answer="Too high";
        	JOptionPane.showMessageDialog(null,answer);
    	}
    	//if the answer is less than the number
    	else if (number<random)
    	{
        	//display the box to say "too low"
        	answer="Too low";
        	JOptionPane.showMessageDialog(null,answer);
    	}
	}
}
    	

