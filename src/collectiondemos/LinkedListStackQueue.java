package collectiondemos;

import java.util.LinkedList;

public class LinkedListStackQueue {
	
	LinkedList l = new LinkedList();

	public static void main(String[] args) {
		
		LinkedListStackQueue obj = new LinkedListStackQueue();
		obj.commonMethods();

	}
	
	public void commonMethods() {
		//adding elements to LinkedList l
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("cow");
		
		System.out.println("After adding Linked List l: "+l);
		
		//adding value for first and last position
		l.addFirst("First");
		l.addLast("Last");
		System.out.println("After inserting first and last element to l1: "+l);
		
		//Getting value of first and Last
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//removing first and last element
		l.removeFirst();
		l.removeLast();
		System.out.println("After removing first and last element position: "+l);
	}

}
