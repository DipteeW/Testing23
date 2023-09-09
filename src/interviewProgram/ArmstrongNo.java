package interviewProgram;
//153=1*1*1+5*5*5+3*3*3=153
public class ArmstrongNo {
	public static void main(String[] args)
	{
		int a = 0,b,temp;
		int no=153;
		temp=no;
		while(no!=0)
		{
			b=no%10;
			no=no/10;
			a=a+(b*b*b);
		}	
		if(temp==a)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}  
	}
}
