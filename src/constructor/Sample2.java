package constructor;

public class Sample2 {
	int a=10;
	int b;
	public Sample2()
	{
		 b=20;
		System.out.println("Default Constructer");
	}
	public Sample2(int i)
	{
		b=i;
	}
	public void method()
	{
		int sum =a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Sample2 obj = new Sample2(20);      //1st constructer
		//obj.method();
	}
	
}
