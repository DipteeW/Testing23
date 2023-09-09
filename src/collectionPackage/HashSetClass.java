package collectionPackage;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Rakesh");
		hs.add("Ayesha");
		hs.add("Solapur");
		hs.add(413006);
		hs.add(9764932194l);
		hs.add(99.99f);
		hs.add('A');
		hs.add("Rakesh");
		hs.add(true);
		System.out.println(hs);
		for(Object temp : hs)
		{
			System.out.print(temp+",");
		}
		System.out.println();
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
	}
}
