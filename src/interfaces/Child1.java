package interfaces;

public class Child1 implements Parent1{

	public void method1() 
	{
		System.out.println("method 1 completed");
	}
	public void method2()
	{
		System.out.println("method 2 completed");
	}
	public void sample()
	{
		System.out.println("Sample is declare in Child Class");
	}
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.method1();
		obj.method2();
		obj.sample();
	}
}
