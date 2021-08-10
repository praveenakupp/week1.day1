package week1.day2;

public class CharOccurance {

	
	
	public static void main (String args[])
	{
		int count= countOccurances("kkkdskkl",'k');
		System.out.println(count);
	}
	private static int countOccurances(String word, char character)
	{
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==character)
			{
				count++;
				
			}
		}
		return count;
		
		
	}
}
