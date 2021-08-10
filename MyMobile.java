package week1.day2;

public class MyMobile {

public void makeCall()
{
	System.out.println("Make Calls");
}

public void sendMsg()
{
	System.out.println("Send Message");
	}

private void payBills()
{
	System.out.println("Pay Bills");
}

public static void main(String args[])
{
	MyMobile obj=new MyMobile();
	obj.makeCall();
	obj.sendMsg();
	obj.payBills();
	
}




}