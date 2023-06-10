package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	
	HashSet<Object> hs = new HashSet<Object>();

	public static void main(String[] args) {
		HashSetDemo1 obj = new HashSetDemo1();
		obj.commonMethods();

	}
	
	public void HashSetDeclarationWays() {
		//HashSet hs = new HashSet(); - default capacity 16 an load factor is 0.75
		//HashSet hs = new HashSet(100); - Initial capacity is 100 and load factor is 0.75
		//HashSet hs = new HashSet(150,(float)0.95); - Initial capacity is 150 and load factor is 0.95
		//HashSet <String> hs = new HashSet<String>(); - Storing String homogeneous data
		
	}
	
	public void commonMethods() {
		//Adding new element to HashSet
		hs.add(100);
		hs.add("string");
		hs.add(15.4);
		hs.add(true);
		hs.add(null);
		hs.add('A');
		System.out.println("After adding elements to hs: "+hs);
		
		//Removing element from HashSet
		hs.remove('A');
		System.out.println("After removing element from hs: "+hs);		
		
		//Searching an element
		System.out.println("null is present: "+hs.contains(null));
		System.out.println("String element is present: "+hs.contains("String"));
		
		//Verifying empty
		System.out.println("HashSet hs is empty: "+hs.isEmpty());
		
		//Reading data using foreach loop
		System.out.println("***********For Each Loop***********");
		for(Object val:hs) {
			System.out.println(val);
		}
		
		//Reading data using Iterator method
		System.out.println("***********Iterator loop***********");
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	
	}

}
