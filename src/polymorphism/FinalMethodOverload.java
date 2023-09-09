package polymorphism;
// final method is overload with diffrent parameter
public class FinalMethodOverload {
	public static void main(String[] args) 
	{
		FinalMethodOverload obj = new FinalMethodOverload();
		obj.method();
		obj.method(10);
		obj.method(20, 30);
	}
	final public void method()
	{
		System.out.println("final method");
	}
	final public void method(int a)
	{
		System.out.println(a);
	}
	final public void method(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
}
