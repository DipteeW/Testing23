package collectionPackage;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Rakesh");
		ll.add("Ayesha");
		ll.add("Solapur");
		ll.add(413006);
		ll.add(9764932194l);
		ll.add(99.99f);
		ll.add(null);
		ll.add(null);
		ll.add(null);
		ll.add('A');
		ll.add("Rakesh");
		ll.add(true);
		System.out.println(ll);
//		for(Object data : ll)
//		{
//			System.out.print(data+",");
//		}
//		System.out.println();
//		Iterator itr = ll.iterator();
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next()+",");
//		}
//		
		ListIterator litr = ll.listIterator(2);
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}	
	}
}
