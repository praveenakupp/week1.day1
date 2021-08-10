package week1.day2;

public class EliminatingDuplicates {
	
	
	
	public static void main (String args[])
	{
		int arr[]= {1,1,2,2,3,3,4,4,5,5,6,6};
		int len=arr.length;
		int j=0;
		
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++]=arr[i]; //1,2,3,4,5,6,7
			}
		}
		arr[j++]=arr[len-1];
		
		for(int k=0;k<j;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
