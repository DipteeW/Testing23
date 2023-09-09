package inheritance;

public class AddCart
{
	public static void main(String[] args)
	{
		Flipkart f = new Flipkart();
		f.Grocery();
		
		MobileModule mm = new MobileModule();
		mm.Mobile();
		mm.Grocery();
		
		ElectronicModule em = new ElectronicModule();
		em.Electronics();
		em.Grocery();
		
	}

}
