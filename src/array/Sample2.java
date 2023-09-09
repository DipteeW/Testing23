package array;

public class Sample2 
{
	public static void main(String[] args)
	{
		int a[]=new int[10];          //dynamic array
		a[0]=2;
		a[1]=4;
		a[2]=6;
	    a[3]=7;
		a[4]=3;
		System.out.println("array size is :" +a.length);
		for (int i = 0; i < a.length; i++)               //print array
		{
			System.out.print(a[i]+",");
		}
		a[5]=72;
		a[6]=54;
		a[7]=16;
		a[8]=17;
		a[9]=32;
		System.out.println();
		for (int i = 0; i < a.length; i++)    //print array
		{
			System.out.print(a[i]+",");
		}
	}

}
