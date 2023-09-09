package collectionPackage;
import java.util.TreeSet;

public class TreeSetClass {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Ayesha");
		ts.add("Junnar");
		ts.add("Pune");
		ts.add("Happy");
		ts.add("BirthDay");
		ts.add("Pooja");
		System.out.println(ts);
		System.out.println(ts.contains("Ayesha"));
		System.out.println(ts.isEmpty());
		ts.remove("Junnar");
		System.out.println(ts);
		for(Object temp : ts) 
		{
	 	System.out.print(temp+",");
	    }	
	}
}
