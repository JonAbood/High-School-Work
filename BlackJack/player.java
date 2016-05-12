
/**
 * The player class represnets the player in the 
 * 
 * @Jonathan Abood
 * @5/7/16 4:34pm)
 */
import javax.swing.JOptionPane;
public class player
{
	public int number=0;
	public static int num=0;
	private int total=0, numCards=0;
	public boolean stay=false;
	private Card[] cards=new Card[5];
	public player()
	{
    	num++;
    	number=num;
    	total=0;
    	for (int counter=0; counter<5; counter++)
    	{
        	Card temp=new Card();
        	cards[counter]=temp;
    	}
    	for (int counter=0; counter<2; counter++)
    	{
        	drawNewCard();
    	}
	}
	public void drawNewCard()
	{
    	numCards++;
    	JOptionPane.showMessageDialog(null,"Player "+number+" draws a "+cards[numCards-1]);
   	 
    	JOptionPane.showMessageDialog(null,"Player "+number+"'s current score is "+getTotal());
   	 
	}
	public int getNumCards()
	{
    	return numCards;
	}
	public int getTotal()
	{
    	total=0;
    	for (int counter=0; counter<numCards; counter++)
    	{
        	total+=cards[counter].getValue();
    	}
    	return total;
	}
	public String toString()
	{
    	String retun="";
    	for (int counter=0; counter<numCards; counter++)
    	{
        	total+=cards[counter].getValue();
        	retun+=cards[counter]+", ";
    	}
    	retun=retun+"\nThe total value is "+total+".";
    	return retun;
	}
}
