package interfaces;

public class Child2 implements Parent1,Parent2{

	public void method1()
	{
		System.out.println("Both from Parent1,Parent2");
	}
	public void method2()
	{
		System.out.println("Both from Parent1,Parent2");
	}
	public static void main(String[] args) {
		Child2 obj = new Child2();
		obj.method1();
		obj.method2();
	}
}
