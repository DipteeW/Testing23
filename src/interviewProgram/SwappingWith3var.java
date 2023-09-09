package interviewProgram;

public class SwappingWith3var 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
		int temp=0;
		System.out.println("Before Swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
