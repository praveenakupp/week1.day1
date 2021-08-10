package week1.day2;

import java.util.Arrays;

public class AnagramString {
	
	public static void main (String args[])
	{
		String str1 = "leader";
	    String str2 = "realde";
	    
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();

	    if(str1.length() == str2.length())   // Verify if length is same
	    {
	      char[] charArray1 = str1.toCharArray();  // convert strings to char array
	      char[] charArray2 = str2.toCharArray();   // convert strings to char array
	    
	      Arrays.sort(charArray1);   // sort the char array
	      Arrays.sort(charArray2);   // sort the char array

	      // if sorted char arrays are same
	      // then the string is anagram
	      boolean result = Arrays.equals(charArray1, charArray2);

	      if(result) {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	    }
	    else {
	      System.out.println(str1 + " and " + str2 + " are not anagram.");
	    }
	  }
	}


