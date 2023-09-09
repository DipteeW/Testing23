package array;
public class Sample1 
{
	public static void main(String[] args)
	{
		int a[]={2,4,3,12,5,6,53,35};     //array length=8  //static array
		//int a[]=new int[length];          //dynamic array
		 int sum = a[2]+a[6];
		System.out.println(sum);
		System.out.println(a[4]);
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++)    //print array
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		for (int j = a.length-1; j>=0; j--)  //reverse array
		{
			System.out.print(a[j]+",");
		}
		
	}
}
		
	

