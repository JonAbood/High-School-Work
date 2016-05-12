
/**
 * Write a description of class Parser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.StringTokenizer;

public class Parser
{
	public static int parseInt(String intake)
	{
    	String temp="";
    	boolean negative=false;
    	int retun=0;
    	if (intake.substring(0,0)=="-")
    	{
        	negative=true;
    	}
    	if (intake==null||intake.equals(""))
    	{
        	intake="0";
    	}
    	StringTokenizer token=new StringTokenizer(intake, "-`~!@#$%^&*()_+=[]\\{}|;',./:\"<>?qwertyuioplkjhgfdsazxcvbnmMNBVCXZLKJHGFDSAPOIUYTREWQ ");
    	while (token.hasMoreTokens())
    	{
        	temp+=token.nextToken();
    	}
    	if (temp==null||temp.equals(""))
    	{
        	temp="0";
    	}
    	if (temp.length()>10)
    	{
        	temp=temp.substring(0,9);
    	}
    	if (negative)
    	{
        	temp="-"+temp;
    	}
    	retun=Integer.parseInt(temp);
    	return retun;
	}
	public static double parseDouble(String intake)
	{
    	String temp="";
    	double retun=0;
    	if (intake==null||intake.equals(""))
    	{
        	intake="0";
    	}
    	StringTokenizer token=new StringTokenizer(intake, "`~!@#$%^&*()_+=[]\\{}|;',/:\"<>?qwertyuioplkjhgfdsazxcvbnmMNBVCXZLKJHGFDSAPOIUYTREWQ ");
    	while (token.hasMoreTokens())
    	{
        	temp+=token.nextToken();
    	}
    	if (temp==null||temp.equals(""))
    	{
        	temp="0";
    	}
    	if (temp.length()>10)
    	{
        	temp=temp.substring(0,9);
    	}
    	retun=Double.parseDouble(temp);
    	return retun;
	}
}


