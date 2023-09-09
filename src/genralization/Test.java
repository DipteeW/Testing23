package genralization;

public class Test {
	public static void main(String[] args) {
		System.out.println("Genral Subject");
		General obj = new General();
		obj.Chemistry();
		obj.Physics();
		obj.Math();
		
		System.out.println("ETC Subject");
		ETC e = new ETC();
		e.Chemistry();
		e.Physics();
		e.Math();
		e.electronics();
		
		System.out.println("Computer Subject");
		Computer c = new Computer();
		c.Chemistry();
		c.Physics();
		c.Math();
		c.java();		
	}
}
