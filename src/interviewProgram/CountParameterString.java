package interviewProgram;

public class CountParameterString 
{
	public static void main(String[] args) 
	{
		String str = "Nagpur is Orange City";
		int count=0;
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Total number of characters in a string: " + count);  
	}

}
