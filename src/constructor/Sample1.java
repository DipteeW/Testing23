package constructor;
//method overloading
public class Sample1 {
	int a=10;
	public void Sample()
	{
		System.out.println("Method 1");
	}
	public void Sample(int i)
	{
		i=a;
		System.out.println(i);
	}
	public void Sample(int i, int j)
	{
		int sum = i+j;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Sample1 obj = new Sample1();
		obj.Sample();
		System.out.println(obj.a);
		obj.Sample(10,20);	
	}
}
