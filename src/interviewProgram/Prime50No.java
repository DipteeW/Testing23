package interviewProgram;

public class Prime50No {
	public static void main(String[] args) 
	{
		int i;
		String  primeNumbers = "";

	 for ( i=1;i<=50;i++) 
	 {
		 int count = 0;
		 for (int j = i; j>=1 ;j--) 
			 {
			 if (i%j == 0) 
			 {
				 count=count+1;
			 }
	         
	 }
	         if (count==2) 
	         {
	        	 primeNumbers = primeNumbers + i + " ";
	         }
	 }
	        	 System.out.print(primeNumbers + " ");     
	}
}
