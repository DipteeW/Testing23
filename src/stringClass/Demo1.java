package stringClass;

public class Demo1 
{
	public static void main(String[] args) 
	{
		String str = "Nagpur";
		String s = "City";
		char ch[]={'s','t','r','i','n','g','s'}; //array in string
		String s1=new String ("Orange");          //Dynamic string
		
		System.out.println(str.length());
		
		System.out.println(s);
		
		System.out.println(ch);
		
		System.out.println(s1);
		
		System.out.println(str + s1 + s);
	}
}
