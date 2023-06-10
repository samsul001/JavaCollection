package collectiondemos;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
	
	LinkedList l1 = new LinkedList();
	LinkedList l2 = new LinkedList();

	public static void main(String[] args) {
		
		LinkedListDemo2 obj = new LinkedListDemo2();
		obj.commonMethods();

	}
	
	public void commonMethods() {
		
		//Adding elements to l1
		l1.add("white");
		l1.add("black");
		l1.add("Red");
		l1.add("Yellow");
		l1.add("Green");
		System.out.println("After adding elements to l1: "+l1);
		
		//Adding l1 collection to l2
		l2.addAll(l1);
		System.out.println("After adding l1 to l2: "+l2);
		
		//removing l1 from l2
		l2.removeAll(l1);
		System.out.println("After removing l1 from l2: "+ l2);
		
		//sorting
		Collections.sort(l1);
		System.out.println("After sorting l1: "+l1);
		
		//sorting in reverse order
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("After sorting reverse order for l1: "+ l1);
		
		//shuffling
		Collections.shuffle(l1);
		System.out.println("After shuffling l1: "+l1);
		
	}

}
