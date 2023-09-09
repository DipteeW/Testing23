package collectionPackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Rakesh");
		al.add("Ayesha");
		al.add("Solapur");
		al.add(413006);
		al.add(9764932194l);
		al.add(99.99f);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add('A');
		al.add("Rakesh");
		al.add(true);
		System.out.println(al);
		System.out.println(al.contains("Rakesh"));
		System.out.println(al.get(1));
		al.set(9, "Jadhav");
		System.out.println(al);
		System.out.println(al.remove(6));
		System.out.println(al);
		for (Object temp : al)
		{
			System.out.print(temp+",");
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+",");
		}
		System.out.println();
		
		ListIterator litr = al.listIterator(5);
		while(litr.hasNext())
		{
			System.out.print(litr.next()+",");
		}
		}
	}

