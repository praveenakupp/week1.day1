package week1.day1;

public class Quotient {

	
	
	public static void main(String args[])
	{
	int num = 345;
	int quotient=1;
	int remainder;
	int total=0;
	
	while(quotient!=0)
	{
		quotient=num/10;
		remainder=num%10;
		total=total+remainder;
		num=quotient;
	}
		System.out.println("Total No. of Digits: " + total);
	}	
		
	}

