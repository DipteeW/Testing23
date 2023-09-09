package inheritance;

public class SuperThis_child extends SuperThis_Parent {
	int a=100;
	int b =200;
	
	public void addition1()
	{
		int a=15;
	
		int sum = a+b+this.a+super.a;  //15+200+100+10
		System.out.println("SuperThis_child "+sum);
	}
	public static void main(String[] args) 
	{
		SuperThis_child obj = new SuperThis_child();
		obj.addition();
	    System.out.println(obj.b);         //global from same class
		obj.addition1();
		
	}
	
}
