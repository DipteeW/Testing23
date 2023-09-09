package collectionPackage;
import java.util.HashMap;

public class HashMapClass {
	public static void main(String[] args) {
		 HashMap<Integer , String> hm = new HashMap<Integer , String>();
		 hm.put(1, "Rakesh");
		 hm.put(3, "Akshay");
		 hm.put(2, "Pratik");
		 hm.put(2, "Pooja");
		 hm.put(5, "Diptee");
		 hm.put(4, "Ayesha");
		 hm.put(6, "Ayesha");
		 System.out.println(hm);	
		 System.out.println(hm.get(3));
		 System.out.println(hm.containsKey(2));
		 System.out.println(hm.containsValue("Pratik"));
		 System.out.println(hm.size());
		 System.out.println(hm.isEmpty());
		 
		 for(int i = 1;i<=hm.size();i++)
		 {
			 if(hm.containsKey(i))
			 {
				 hm.put(i, hm.get(i));
			 }
		 }
		 System.out.println(hm);
	}
}
