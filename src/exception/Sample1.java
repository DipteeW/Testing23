package exception;

public class Sample1 
{
	public static void main(String[] args) 
	{
		int a =10;
		
		try
		{
			System.out.println(a/0);   
			
			Thread.sleep(100);                     //Exception
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);                 //handle
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);                //handle
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("Always Executed");    //claen up code
		}
		
	}

}
