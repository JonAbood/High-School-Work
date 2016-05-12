
/**
 * Write a description of class Maze here.
 * This is an old game based on stones. The object of the game is to be able to pick up atleast 1 
 * stone while making sure that the stone you pick up is not the last one in the plie, otherwise you 
 * lose.The game will generate a random number between 15 and 30.Once this is done, it will then ask 
 * the user how many stones to pick. Valid askers are 1, 2, and 3. Anything else will cause the 
 * program to print "Invalid input" and then re-ask the user to input a number. Then the computer 
 * will pick how many stones it wishes to take. However this is a modified version, so the computer
 * will strategicly pick the number of stones to better its cahnces at winning. At the end the program
 * prints who won!
 * @Jonathan Abood
 * @5/11/16
 */
import javax.swing.JOptionPane;
public class StonesGame_FINAL
{
   
	public static void main(String[]args)
	{
    	//craete vars
    	int stones, number=0;
    	String answer;
    	//generate a random number between 15 and 30
    	stones=15+(int)(Math.random()*(30-15+1));
    	//while that number is greater than 0
    	while (stones>0)
    	{
        	number=0;
        	while (number<1||number>3||number>stones)
        	{
            	//display message box with the current number of stones and asks how many you'd like.
            	answer=JOptionPane.showInputDialog("There are "+stones+" stones. \nHow many would you like?");
            	number=Integer.parseInt(answer);
            	if (number<1||number>3||number>stones)
            	{
                	answer="Invalid number of stones!!!";
                	JOptionPane.showMessageDialog(null,answer);
            	}
        	}
        	//subtract that number from the current total
        	stones=stones-number;
        	//if the number of stones is less than 1
        	if (stones==0)
        	{
            	//display answer box to say that player 1 loses
            	answer="COMPUTER WINS!!";
            	JOptionPane.showMessageDialog(null,answer);
        	}
        	//else
        	else
        	{
            	number=0;
            	while (number<1||number>3||number>stones)
            	{
                	if (stones==1)
                	{
                    	number=1;
                	}
                	else if (stones==2)
                	{
                    	number=1;
                	}
                	else if (stones==3)
                	{
                    	number=2;
                	}
                	else if (stones==4)
                	{
                    	number=3;
                	}
                	else if (stones==6)
                	{
                    	number=1;
                	}
                	else if (stones==7)
                	{
                    	number=2;
                	}
                	else if (stones==8)
                	{
                    	number=3;
                	}
                	else if (stones==10)
                	{
                    	number=1;
                	}
                	else if (stones==11)
                	{
                    	number=2;
                	}
                	else if (stones==12)
                	{
                    	number=3;
                	}
                	else if (stones==14)
                	{
                    	number=1;
                	}
                	else if (stones==15)
                	{
                    	number=2;
                	}
                	else if (stones==16)
                	{
                    	number=3;
                	}
                	else if (stones==18)
                	{
                    	number=1;
                	}
                	else if (stones==19)
                	{
                    	number=2;
                	}
                	else if (stones==20)
                	{
                    	number=3;
                	}
                	else if (stones==22)
                	{
                    	number=1;
                	}
                	else if (stones==23)
                	{
                    	number=2;
                	}
                	else if (stones==24)
                	{
                    	number=3;
                	}
                	else if (stones==26)
                	{
                    	number=1;
                	}
                	else if (stones==27)
                	{
                    	number=2;
                	}
                	else if (stones==28)
                	{
                    	number=3;
                	}
                	else if (stones==30)
                	{
                    	number=1;
                	}
                	else
                	{
                    	number=1+(int)(Math.random()*(3-1+1));
                	}
                	answer="There are "+stones+" stones \nThe computer takes "+number;
                	JOptionPane.showMessageDialog(null,answer);
            	}
            	//subtract that number from the current total
            	stones=stones-number;
            	//if the number of stones is less than 1
            	if (stones==0)
            	{
                	//display answer box to say that player 1 loses
                	answer="YOU WIN!!";
                	JOptionPane.showMessageDialog(null,answer);
            	}
        	}
    	}
	}
}
	

