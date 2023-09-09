package accessModifier;

public class Child extends Parent{
	private void method()
	{
		System.out.println("Child private method");
	}
	public static void main(String[] args)
	{
		Child c = new Child();
		c.method();
		
		Parent p = new Parent();
		p.method2();             //default
		p.method3();             //protected
		p.method4();             //public
		
	}

}
