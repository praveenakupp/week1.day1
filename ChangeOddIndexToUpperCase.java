package week1.day2;

public class ChangeOddIndexToUpperCase {

	
	public static void main (String args[])
	{
		 String testString = "sample program";
	        String output = "";
	        for (int i = 0; i < testString.length(); i++) {
	            if(i%2 == 0)
	            {
	                output += Character.toUpperCase(testString.toCharArray()[i]);
	            }else
	            {
	                output += Character.toLowerCase(testString.toCharArray()[i]);
	            }
	        }

	        System.out.println("Newly generated string is as follow: "+ output);
	    }
	}
