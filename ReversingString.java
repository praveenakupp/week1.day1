package week1.day2;

public class ReversingString {
	
	public static void main (String args[])
    {

	String a = "Welcome";
	String t = " ";
	for(int i=a.length()-1;i>=0;i--)
	{
		t=t+a.charAt(i);
	}
	System.out.println(t);
    }
	}

	

