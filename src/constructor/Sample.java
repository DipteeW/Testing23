package constructor;
//constructor overloading
public class Sample {
	public Sample()
	{
	System.out.println("Default Constructor"); 
	}
	public Sample(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public Sample(float c)
	{
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Sample obj = new Sample();
		Sample obj1 = new Sample(10,20);
		Sample obj2 = new Sample(10.2f);
	}
}
//every constructor initialize by diffrent object creation 
//you have to call only that particular costurctor to initialize the object of that constructor