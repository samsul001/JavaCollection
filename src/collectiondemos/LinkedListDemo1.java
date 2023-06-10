package collectiondemos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
	
	LinkedList l = new LinkedList();

	public static void main(String[] args) {
		LinkedListDemo1 lObj = new LinkedListDemo1();
		lObj.commonMethodsOfList();

	}
	
	public void LinkedListDeclarationWays() {
		//LinkedList l = new LinkedList(); - Storing hetrogeneous data
		//LinkedList <Integer> l = new LinkedList <Integer>(); - Storing Homogeneous data , numbers only
		//List l = new LinkedList();
	}
	
	public void commonMethodsOfList() {
		
		//Ading element to "l" LinkedList		
		l.add(100);
		l.add("selenium");
		l.add(12.25);
		l.add('A');
		l.add("apython");
		l.add("40aa");
		l.add(null);
		System.out.println("Master elements of l LinkedList: "+l);
		
		//Size of element to "l" LinkedList
		System.out.println(l.size());
		
		//removing of element
		l.remove(4);
		System.out.println("After removing element: "+l);
		
		//Inserting new element
		l.add(4, "Swift");
		System.out.println("After inserting new element: "+l);
		
		//retrieving an element from collection
		System.out.println("1st element of LinkedList collection"+l.get(0));
		
		//Change element value
		l.set(0, "restapi");
		System.out.println("After replacing value of 1st position: "+l);
		
		//Searching element value from LinkedList
		System.out.println("restApi is present: "+l.contains("restapi"));
		System.out.println("Selenium is present: "+l.contains("Selenium"));
		
		//Veriying cloolection is empty or not
		System.out.println("Collection is empty: "+l.isEmpty());
		
		//read data using For loop
		System.out.println("*************For loop*************");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		//read data using for each loop
		System.out.println("*************For each loop*************");
		for(Object val:l) {
			System.out.println(val);
		}
		
		//read data using Iterator method
		System.out.println("*************Iterator method*************");
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
