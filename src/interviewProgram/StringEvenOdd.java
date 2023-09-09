package interviewProgram;
// check string even and odd with index of string as like that d is position on 0
public class StringEvenOdd {
	public static void main(String[] args) 
	{
		String s = "Diptee";
		System.out.println("Even String");
		for (int i = 0; i < s.length(); i=i+2) 
		{
			char ch = s.charAt(i);
			System.out.println(ch+",");
		}
		System.out.println("odd String");
		for (int i = 1; i < s.length(); i=i+2) 
		{
			char ch = s.charAt(i);
			System.out.println(ch+",");
		}
	}
}
//d=0 
//i=1 
//p=2 
//t=3 
//e=4 
//e=5 
