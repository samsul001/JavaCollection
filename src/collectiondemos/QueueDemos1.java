package collectiondemos;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemos1 {

	PriorityQueue pq = new PriorityQueue();
	PriorityQueue pq1 = new PriorityQueue();
	
	public static void main(String[] args) {
		
		QueueDemos1 obj = new QueueDemos1();
		obj.commonMethods();

	}
	
	public void commonMethods() {
		//Adding elements to queue
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.offer(400);
		pq.offer(200);
		System.out.println("After adding elements to pq: "+pq);
		
		/*
		pq1.add("String");
		pq1.add("Statement");
		pq1.offer("Java");
		pq1.offer("C#");
		pq1.offer("Java");
		System.out.println("After adding elements to pq1: "+pq1);
		*/
		
		//return header element using element() , peek()
		System.out.println(pq.element());
		System.out.println(pq.peek());
		
		//Validating Exception thrown scenario or element() if Queue is empty
		//System.out.println("Exception if queue is empty: "+pq1.element());
		
		//Valiating false return for peek() if queue is empty
		System.out.println("Queue is empty: "+pq1.peek());
		
		
		//Return and Remove element using remove(), poll()
		pq.remove();
		System.out.println("After removing header using remove method: "+pq);
		pq.add(200);
		System.out.println(pq);
		pq.poll();
		System.out.println("After removing header using poll method: "+pq);
		
		//Validating Exception thrown scenario for remove() if Queue is empty		
		//System.out.println(pq1.remove());
		
		//Validating null value is given for poll() if Queue is empty		
		//System.out.println(pq1.poll());
		
		//Read data using Iterator
		System.out.println("*************Iterator loop*******************");
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Read data using for each loop
		System.out.println("*************For Each loop*******************");
		for(Object val:pq) {
			System.out.println(val);
		}
			
		
		
	}

}
