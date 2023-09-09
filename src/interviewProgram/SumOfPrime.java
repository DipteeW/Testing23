package interviewProgram;

public class SumOfPrime {
	public static void main(String[] args) {
		int a[]= {11,14,17,22,24};
		int sum = 0;
		for (int i = 0; i < a.length; i++)
		{
			int count = 0;
			for (int j = 1; j <= a[i]; j++)
			{
				if(a[i]%j==0)
				count++;
			}
			if(count==2) 
				{
				System.out.println("Prime no = "+a[i]);
					sum = sum + a[i];
				}
			}
			System.out.println(sum);	
		}
}	
	
	

