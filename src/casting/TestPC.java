package casting;

public class TestPC {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.bunglow();
		p.farm();
		System.out.println(p.a);
		Child c = new Child();
		c.bike();
		c.bunglow();
		c.farm();
		System.out.println(c.a);
		
	//upcastint child class object with refernce of parent class
		Parent pc = new Child();
		pc.bunglow();                 //only parent class property
		pc.farm();
		System.out.println(pc.a);  //Parent a=10
	}
}
