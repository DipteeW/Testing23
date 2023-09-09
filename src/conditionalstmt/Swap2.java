package conditionalstmt;
//swapping 2 variable using (* and /)operator
public class Swap2 {
	public static void main(String[] args) 
	{ 
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);
		a=a*b;                        //a=200
		b=a/b;                        //b=200/20=10
		a=a/b;                        //a=200/10=20
		System.out.println("After swap");
		System.out.println(a);
		System.out.println(b);		
	}
}
