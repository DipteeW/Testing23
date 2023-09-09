package polymorphism;

public class MethodOverloading {
	public static void main(String[] args) 
	{
		int a=20;
		int b=40;
		int c=25;
		addition(a, b);
		addition( a, b, c);
		MethodOverloading obj = new MethodOverloading();
		obj.addition(25);	
	}
	public void addition(int a)  //insatance method
	{
		int b = 10;
		int sum =a+b ;
		System.out.println(sum);
	}
	public static void addition(int a, int b)//Static method
	{
		int sum=a+b;	
		System.out.println(sum);
	}	
	public static void addition(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
}
//in method overloading static and non static both are overloaded at a time