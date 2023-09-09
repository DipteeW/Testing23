package interviewProgram;

public class PrimeNo {
	public static void main(String[] args) {
		int no = 17;
		int count = 0 ;
		if(no>1)
		{
			for(int i=1;i<=no;i++) 
			{
			if(no%2==1)
			count++;
		    }
		}
		if(count==no)
			{
				System.out.println("No is Prime = " +count);
			}
			else
			{
				System.out.println("not prime = " +count);
			}
		}
}


