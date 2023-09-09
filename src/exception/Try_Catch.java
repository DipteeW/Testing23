package exception;

public class Try_Catch 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=10;
		try 
		{
			int c=a/0;
			int d[]=new int[2];
			d[4]=10;	
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("clean up code");
		}
	}

}
