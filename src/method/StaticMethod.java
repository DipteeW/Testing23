package method;

import staticDiffPackage.DiffPackageDiffClass;

public class StaticMethod {
	
	static int a=10;
	static int b=20;
	public static void addition()
	{
		int sum = a+b;
		System.out.println(sum);	
	}
	public static void subtraction()
	{
		int sub=a-b;
		System.out.println(sub);
	}
	public static void main(String[] args)
	{
		addition();
		subtraction();
		StaticDiffClass.method1();
		DiffPackageDiffClass.method2(); 
    }
}