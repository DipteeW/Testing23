package interviewProgram;
//prime number is divide by 1 and itself
//prime no--->2,3,5,7,11,13,17,19
//not prime-->1,4,14
public class PrimeOrNot 
{
	public static void main(String[] args)
	{
		int no=13;
		int count=0;
		
		if(no>1)                      //condition is true then enter the block and no is prime
			{
			for(int i=1;i<=no;i++)
			{
			if(no % i==0)          //number is succesfully divide by 0 then count will be increses otherwise not
			count++;	
			} 
			if(count==2)     // if the count value is 2 no is prime and if the count value is not 2 or greter than 2 then number is not prime 
			{
			 System.out.println("Prime number "+count);
			}
			else
			{
			  System.out.println("Not prime number "+count);
			}
			}
	}
}	

