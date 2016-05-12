
/**
 * This is card, which creates value, suit and face of the cards used in blackjack
 * 
 * @Jonathan Abood
 * @5/7/16 4:34pm
 */
//import java.util.Random;

public class Card
{
	private String suit;
	private String face;
	private int value;
	private static String[] cards=new String[0];
//	private static final Random gen=new Random();
    
	public Card()
	{
    	do
    	{
        	setSuit();
        	setFace();
        	setValue();
    	}
    	while (inArray());
    	addToString();
	}
    
	private void setSuit()
	{
//    	int num=gen.nextInt(4)+1;
    	int num=(int)(Math.random()*5+1);
    	if (num==1)
        	suit="Spades";
    	else if (num==2)
        	suit="Hearts";
    	else if (num==3)
        	suit="Diamonds";
    	else
        	suit="Clubs";
	}
    
	private void setFace()
	{
//    	int num=gen.nextInt(13)+1;
    	int num=(int)(Math.random()*13+1);
    	if (num==1)
        	face="Ace";
    	else if (num==11)
        	face="Jack";
    	else if (num==12)
        	face="Queen";
    	else if (num==13)
        	face="King";  
    	else
        	face=""+num;
	}
    
	private void setValue()
	{
    	if (face.equals("Ace"))
        	value=1;
    	else if (face.equals("10")||face.equals("Jack")||face.equals("Queen")||face.equals("King"))
        	value=10;    
    	else
        	value=Integer.parseInt(face);
	}
	public String getSuit()
	{
    	return suit;
	}
	public String getFace()
	{
    	return face;
	}
	public int getValue()
	{
    	return value;
	}
	public String toString()
	{
    	String output=face+" of "+suit+"";
    	return output;
	}
	private void addToString()
	{
    	increaseSize();
    	cards[cards.length-1]=toString();
	}
	private void increaseSize()
	{
    	String[] temp=new String[cards.length+1];
   	 
    	for (int cd=0; cd<cards.length; cd++)
        	temp[cd]=cards[cd];
   	 
    	cards=temp;
	}
	private boolean inArray()
	{
    	Searches search=new Searches();
    	String target=toString();
    	int pos=search.linearSearch(cards, target);
    	if (pos==-1)
    	{
        	return false;
    	}
    	else
    	{
        	return true;
    	}
	}
}


