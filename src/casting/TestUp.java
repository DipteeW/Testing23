package casting;

public class TestUp {
	public static void main(String[] args)
	{	
		ParentUp pc = new ChildUp();
		pc.method1();
		pc.method2();
		System.out.println(pc.a);
	}
}
//WebDriver Driver = new ChromeDriver();
//WebDriver Driver = new EdgeDriver();