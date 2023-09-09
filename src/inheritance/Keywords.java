package inheritance;

public class Keywords {
	int a=20;
	public void method(int a)
	{
		int sum = this.a+a;
		System.out.println(sum);
	}
	final public void method2()
	{
		System.out.println("Final method");
	}
	public static void main(String[] args) 
	{
		Keywords obj = new Keywords();
		System.out.println(obj.a);      //global a
		obj.method(10);
		obj.method2();
	}

}
