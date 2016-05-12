
/**
 * Write a description of class HeadsOrTailsV4 here.
 * This program simulates flipping a coin. The program will ask the user how many times it wishes to
 * flip a coin. The coin has two sides, heads and tails. The program will simulate flipping the coin 
 * the number of times the user enters. The program will then go on to print each consecutive time in
 * a single JOptionPane box. Also at the bottom of this box it will print the number of times it landed
 * heads and the number of times it landed tails
 * @Jonathan Abood
 * @5/11/16
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class HeadsOrTails_4
{
	public static void main(String[]args)
	{
    	//create the decimal format!!!
    	DecimalFormat output=new DecimalFormat("0.00");
    	//create vars
    	int howmany;
    	int num, numh, numt;
    	String answer;
    	String finalanswer;
    	//ask how many times
    	answer=JOptionPane.showInputDialog("How many flips? ");
    	howmany=Integer.parseInt(answer);
    	//do the following that many times with a for loop
    	finalanswer="";
    	numh=0;
    	numt=0;
    	for (int counter=0; counter<howmany; counter++)
    	{
        	//ask for a 1 0r 2
        	num=1+(int)(Math.random()*(2-1+1));
        	//if it's a 1, answer with heads.
        	if (num==1)
        	{
            	finalanswer=finalanswer+"Heads\n";
            	numh=numh+1;
           	 
        	}
        	//if it's a 2, answer with tails.
        	else if (num==2)
        	{
            	finalanswer=finalanswer+"Tails\n";
            	numt=numt+1;
        	}
    	}
    	finalanswer=finalanswer+"There were "+numh+" heads and "+numt+" tails.";
    	JOptionPane.showMessageDialog(null,finalanswer);
	}
}
    	

