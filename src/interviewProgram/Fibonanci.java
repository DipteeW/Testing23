package interviewProgram;

public class Fibonanci {
	public static void main(String[] args)
	{
	int no = 15,n1 = 0, n2= 1;
    System.out.println("Fibonacci Series");
    
    for (int i = 1; i <= no; i++)
    {
    	System.out.print(n1+ ",");
    	int fib= n1 + n2;
    	n1 = n2;
    	n2 = fib;
    }
  }
}
