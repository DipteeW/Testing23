package conditionalstmt;

public class Demo
{
	public static void main(String[] args) 
	{
		int time = 15;
		if(time<10)
		{
			System.out.println("Good Morning");
		}
		else if(time<18)
		{
			System.out.println("Good evening");	
		}
		else if(time>23)
		{
			System.out.println("Good night");
		}
		else
		{
			System.out.println("Good day");
		}
		}
		
	}


