package interviewProgram;

public class ReverseDigit {
	public static void main(String[] args) 
	{
		int no=1234;
		int rev=0;
		
		while(no!=0)
		{ 
			//rem=no%10;
		    // rev=rev*10+rem;
			//	no=no/10;
			
			rev=rev*10+no%10;   //0+1234%10=4   4*10+3=43   430+2= 432       4320+1=4321    
			no=no/10;           //1234/10=123       123/10=12    12/10=1   1/10=0
	    }
		System.out.println("Reverse Digit "+rev);
	}
}
