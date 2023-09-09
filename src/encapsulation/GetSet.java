package encapsulation;

public class GetSet
{
	private int a;
	private String str;
		public void setMethod(int x)
		{
			a=x;
		}
		public void setMethod1(String y)
		{
			str=y;
		}
		public int getMethod()
		{
			System.out.println(a);
			return a;
		}
		public String getMethod1()
		{
			System.out.println(str);
			return str;
		}
		public static void main(String[] args) 
		{
			GetSet gs = new GetSet();
			gs.setMethod(10);
			gs.setMethod1("Diptee");
			gs.getMethod();
			gs.getMethod1();
			//System.out.println(gs.getMethod());
			//System.out.println(gs.getMethod1());
		}
		
	}
	


