package exception;

public class ThrowClass 
{
	private static void Method() 
	{
	 int age = 18 ;
	if(age<18) 
	 {  
                                                                                //throw Arithmetic exception if not eligible to vote  
         throw new ArithmeticException("Person is not eligible to vote");
       
     }  
     else
     {  
         System.out.println("Person is eligible to vote!!");  
     }  
	}
 public static void main(String args[])
 {  
                                                                             //calling the function  
     Method();   
}


}
