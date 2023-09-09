package keyword;

public class SThis extends Super1{
	int a = 100;
	int b = 200;
	public void addition()
	{
		int a = 1000;
		int b = 2000;
		//int sum = this.a+this.b;              //300
		int sum= super.a +super.b;
		System.out.println(sum);
		System.out.println("hi");
	}
	public static void main(String[] args)
	{
		SThis obj = new SThis();
		obj.addition();	         //3000	
		obj.method();
	}
}
