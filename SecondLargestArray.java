package week1.day2;

import java.util.Arrays;

public class SecondLargestArray {

	public static void main (String args[])
	{
				int[] arrNum = {34,400,5,81,100,999,1};
	          	Arrays.sort(arrNum); //Sorting Array
				
				// Step 3: print the second largest element of the array
				System.out.println(" Largest element in the array:" + arrNum[arrNum.length-2]);
				
				
	}
}
