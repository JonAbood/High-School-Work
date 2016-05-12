
/**
 * Write a description of class PalindroneTester here.
 * This is a program to test if a word entered in is a palindrone. The program is fairly simple, enter
 * a word, sentence or whatever you'd like and the program will tell you if it is a palindrone.
 * This program utalizes StringTokenizer and will remove ("`1234567890-=[]\\;',./ ~!@#$%^&*()_+{}|:\"<>?")
 * from whatever you type in, in order to make life easier.
 * @Jonathan Abood
 * @5/11/16
 */


import javax.swing.*;
import java.util.StringTokenizer;

public class PalindromeTester
{
	public static void test()
	{
   	String palindrome=JOptionPane.showInputDialog(null, "Enter the potential palindrome.");
   	StringTokenizer token=new StringTokenizer(palindrome, "`1234567890-=[]\\;',./ ~!@#$%^&*()_+{}|:\"<>?");
   	palindrome="";
   	while (token.hasMoreTokens())
   	{
       	palindrome+=token.nextToken();
   	}
   	if (palindrome.equals(get(palindrome)))
   	{
       	JOptionPane.showMessageDialog(null, palindrome+" is a palindrome.");
   	}
   	else
   	{
       	JOptionPane.showMessageDialog(null, palindrome+" is not a palindrome: "+get(palindrome));
   	}
	}
	private static String get(String original)
	{
   	String retun;
   	if (original.length()<=1)
   	{
       	retun=original;
   	}
   	else
   	{
       	retun=""+original.charAt(original.length()-1)+get(original.substring(0, original.length()-1));
   	}
   	return retun;
	}
}




