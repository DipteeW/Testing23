package stringClass;
import java.util.Iterator;
public class CommonChar {
	
	public static void main(String[] args) 
	{	
		String str ="Welcome World";
		int length=str.length();                    //calcalate the length of str
		char[] ch=str.toCharArray();                //tocharArray is used for separate char
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i+1; j < str.length(); j++) 
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
				}
			}
		}
	}  
}
