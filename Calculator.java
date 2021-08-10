package week1.day2;

public class Calculator {
	int num1=10,num2=20,num3=30;
	
	public int add(int num1, int num2, int num3)
	{
		int num4=num1+num2+num3;
		System.out.println("Added Value is: " + num4);
		return num4;
	}
	public int sub(int num1,int num2)
	{
		int num4=num2-num1;
		System.out.println("Subtrated Value is: " + num4);
		return num4;
	}
	public double mul(double num1, double num2)
	{
		double num4=num1*num2;
		System.out.println("Multiplied Value is: " + num4);
		return num4;
	}
	public float divide(float num1, float num2)
	{
		float num4=num1/num2;
		System.out.println("Divided Value is: " + num4);
		return num4;
	}
	public static void main(String args[])
	{
		Calculator calobj=new Calculator();
		calobj.add(10,20,30);
		calobj.sub(10,20);
		calobj.mul(10,20);
		calobj.divide(10,20);
	
	}
}
