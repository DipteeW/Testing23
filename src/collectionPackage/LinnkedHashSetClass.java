package collectionPackage;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinnkedHashSetClass {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Rakesh");
		lhs.add("Ayesha");
		lhs.add("Solapur");
		lhs.add(413006);
		lhs.add(9764932194l);
		lhs.add(99.99f);
		lhs.add('A');
		lhs.add("Rakesh");
		lhs.add(true);
		System.out.println(lhs);
		
		for(Object temp : lhs)
		{
			System.out.print(temp+",");
		}
		System.out.println();
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
	}
}
