package exception;

public class tryClass {
	public static void main(String[] args) {
		int a=0;
		int b=20;
		int div = 0;
		int c[]= {2,4,0,6};
		try 
		{
			//div = b/c[2];
			//div = b/c[1];
			div = b/c[4];
		}
		catch (ArithmeticException e)
		{
			System.out.println("div by zero");
		}
		catch (ArrayIndexOutOfBoundsException aie) 
		{
			System.out.println("out of capacity");
		}
		catch (Exception e)
		{
			System.out.println("Parent exception");
		}
		System.out.println(div);
	}
}
