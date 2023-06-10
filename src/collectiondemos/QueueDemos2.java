package collectiondemos;

import java.util.LinkedList;

public class QueueDemos2 {
	
	LinkedList ls = new LinkedList();
	LinkedList ls1 = new LinkedList(); 

	public static void main(String[] args) {
		
		QueueDemos2 obj = new QueueDemos2();
		obj.commonMethods();

	}
	
	public void commonMethods() {
		//Adding elements to Linked List using add() and offer()
		ls.add(100);
		ls.add("System");
		ls.add(2000);
		ls.add('A');
		ls.offer(true);
		ls.offerLast("Seminar");
		ls.offerFirst(200);
		System.out.println("After adding elements to ls: "+ls);
		
		//Returning header element using element(), peek()
		System.out.println(ls.element());
		System.out.println(ls.peek());
		
		//validating exception and false for element and peek respectively
		//System.out.println(ls1.element());
		System.out.println(ls1.peek());
		
		
		//Return and remove header element
		System.out.println("REMOVING ELEMENT FROM LS: "+ls.remove());
		System.out.println("AFTER REMOVING ELEMENT FROM LS: "+ls);
		
		
		//Return and poll header element
		System.out.println("REMOVING ELEMENT FROM LS: "+ls.poll());
		System.out.println("AFTER REMOVING ELEMENT FROM LS: "+ls);
		
		//validating exception and false for remove() and poll() respectively
		
		//System.out.println(ls1.remove());
		System.out.println(ls1.poll());
		
	}

}
