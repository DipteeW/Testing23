package interfaces;

public interface Parent1 {
	int a=10;                 //in interface variable is always static
	public void method1();  //by default abstract method
	public void method2();
	static public void method3()   //not call in child class it is only for interface
	{
		System.out.println("static method");  //static method allowed in interface
	}
}
