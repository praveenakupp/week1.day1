package week1.day2;

public class FindTypesInString 
{
	
	public static void main(String args[])
	{
		String input = "12.54"; 
		String datatype = null;
		 
	        // checking for Integer
	        if (input.matches("\\d+")) {
	            datatype = "java.lang.Integer";
	        }
	 
	        // checking for floating point numbers
	        else if (input.matches("\\d*[.]\\d+")) {
	            datatype = "java.lang.Double";
	        }
	 
	        // checking for date format dd/mm/yyyy
	        else if (input.matches(
	                     "\\d{2}[/]\\d{2}[/]\\d{4}")) {
	            datatype = "java.util.Date";
	        }
	     // checking for date format mm/dd/yyyy
	        else if (input.matches(
	                     "\\d{2}[/]\\d{2}[/]\\d{4}")) {
	            datatype = "java.util.Date";
	        }
	 
	        // checking for date format dd-mon-yy
	        else if (input.matches(
	                     "\\d{2}[-]\\w{3}[-]\\d{2}")) {
	            datatype = "java.util.Date";
	        }
	 
	        // checking for date format dd-mon-yyyy
	        else if (input.matches(
	                     "\\d{2}[-]\\w{3}[-]\\d{4}")) {
	            datatype = "java.util.Date";
	        }
	 
	        // checking for date format dd-month-yy
	        else if (input.matches("\\d{2}[-]\\w+[-]\\d{2}")) {
	            datatype = "java.util.Date";
	        }
	 
	        // checking for date format dd-month-yyyy
	        else if (input.matches("\\d{2}[-]\\w+[-]\\d{4}")) {
	            datatype = "java.util.Date";
	        }
	 
	        // checking for date format yyyy-mm-dd
	        else if (input.matches(
	                     "\\d{4}[-]\\d{2}[-]\\d{2}")) {
	            datatype = "java.util.Date";
	        }
	 
	        // checking for String
	        else {
	            datatype = "java.lang.String";
	        }
	 
	        System.out.println("The datatype of " + input
	                           + " is: " + datatype);
	    }

}
	



	 
	 