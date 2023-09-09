package accessModifier;

public class Parent {
	private void method1()
	{
		System.out.println("Private method");
	}
	void method2()
	{
		System.out.println("Default method");
	}
	protected void method3()
	{
		System.out.println("protected method");
	}
	public void method4()
	{
		System.out.println("Public method");
	}

}
