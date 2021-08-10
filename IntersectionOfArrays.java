package week1.day2;

public class IntersectionOfArrays {

	
	public static void main(String args[])
	{
		int myArray1[] = {499, 362, 196, 378,555};
	    int myArray2[] = {555,20, 362, 73, 55};
	      System.out.println("Intersection of the two arrays --->");
	     //Two for loops are used. The Outer loop is to iterate the elements of the first array
	      //Second loop is to iterate the elements of the second array. comparing the elements
	      //of two arrays in the second loop
	      for(int i = 0; i<myArray1.length; i++ ) {
	         for(int j = 0; j<myArray2.length; j++) {
	            if(myArray1[i]==myArray2[j]) {
	               System.out.println(myArray2[j]);
	            }
	         }
	      }
	   }
	}
	

