package abstractClass;

public class ParentChildTest extends Child{

	public void method4() {
		System.out.println("Method 4");
	}
	public static void main(String[] args) 
	{
		ParentChildTest obj = new ParentChildTest();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();	
	}
}
