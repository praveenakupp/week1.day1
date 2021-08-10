package week1.day2;

public class Palindrome {

	
	public static void main (String args[])
	{
		String str ="madam";
		int start =0;  //1
		int end=str.length()-1; //3
		
		boolean ispalindrome=true;
		
		while(start<end) //0<4
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				ispalindrome=false;
				break;
			}
			start++;
			end--;
		}
		if(ispalindrome) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
}
