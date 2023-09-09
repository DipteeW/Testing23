package array;

public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,2,4,1,3,6};
		
		System.out.println("Duplicate Array");
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)   //incremenet
			{
				if (arr[i]==arr[j])                  //duplicates
				{
					System.out.println(arr[j]);
				}
			}		
		}
		
	}
	

}
