
/**
 * BlackJack is a program which simulates a black jack game.
 * The program will dealer player 1(the dealer) 2 cards.
 * The game will first start by asking you how many cards you'd like, and then dealing you that many.
 * It will then ask you if you would like to hit.(Options Yes, No, Cancel*** cancel acts like no)
 * The game will then total up both your and the computers scores and print the winner.
 * 
 * @Jonathan Abood
 * @5/7/16 
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class BlackJack
{
	static player[] players;
	static player dealer=new player();
	private static void test()
	{
    	player test=new player();
    	System.out.println(test);
    	test.drawNewCard();
    	System.out.println(test);
	}
	public static void play()
	{
    	JOptionPane.showMessageDialog(null, "Dealer is player 1.");
    	String response=JOptionPane.showInputDialog("How many players?");
    	int numPlayers=Parser.parseInt(response);
    	player[] players=new player[numPlayers];
    	for (int counter=0; counter<numPlayers; counter++)
    	{
        	players[counter]=new player();
    	}
    	//while game is still going on
    	//{
        	for (int counter=0; counter<numPlayers; counter++)
        	{
            	playerTurn(counter, players);
        	}
        	dealerTurn(dealer);
    	//}
    	result(players, dealer);
	}
	private static void playerTurn(int index, player[] players)
	{
    	while (players[index].getTotal()<21&&!players[index].stay&&players[index].getNumCards()<5)
    	{
        	int print=index+2;
        	//print is the display number of the player at position index
        	int cont=JOptionPane.showConfirmDialog(null,"Player "+print+": Would you like another card?");
        	if (cont==0)
        	{
            	players[index].drawNewCard();
        	}
        	else
        	{
            	players[index].stay=true;
        	}
    	}
	}
	private static void dealerTurn(player dealer)
	{
    	if (dealer.getTotal()<17&&dealer.getNumCards()<5)
    	{
        	dealer.drawNewCard();
    	}
	}
	private static void result(player[] players, player dealer)
	{
    	if (dealer.getTotal()>21)
    	{
        	JOptionPane.showMessageDialog(null, "The dealer has a total of "+dealer.getTotal()+". The dealer busts.");
        	//everyone wins
        	for (int counter=0; counter<players.length; counter++)
        	{
            	int print=counter+2;
            	//print is the display number of the player at position counter
            	if (players[counter].getTotal()<21)
            	{
                	JOptionPane.showMessageDialog(null,"Player "+print+" has a score of "+players[counter].getTotal()+". You did not bust. You win!");
            	}
            	else
            	{
                	JOptionPane.showMessageDialog(null,"Player "+print+" has a score of "+players[counter].getTotal()+". You busted!");
            	}
        	}
    	}
    	else
    	{
        	JOptionPane.showMessageDialog(null,"The dealer has a total of "+dealer.getTotal()+".");
        	//only higher scores win
        	for (int counter=0; counter<players.length; counter++)
        	{
            	int print=counter+2;
            	//print is the display number of the player at position counter
            	if (players[counter].getTotal()>dealer.getTotal()&&players[counter].getTotal()<=21)
            	{
                	JOptionPane.showMessageDialog(null,"Player "+print+" has a score of "+players[counter].getTotal()+", which is greater than the dealer's. You win!");
            	}
            	else if (players[counter].getTotal()<dealer.getTotal()&&players[counter].getTotal()<=21)
            	{
                	JOptionPane.showMessageDialog(null,"Player "+print+" has a score of "+players[counter].getTotal()+", which is less than the dealer's. You lose!");
            	}
            	else if (players[counter].getTotal()>21)
            	{
                	JOptionPane.showMessageDialog(null,"Player "+print+" has a score of "+players[counter].getTotal()+". You busted!");
            	}
            	else
            	{
                	JOptionPane.showMessageDialog(null,"Player "+print+" has a score of "+players[counter].getTotal()+", which is the same as the dealer's. You lose!");
            	}
        	}
    	}
	}
    
}
