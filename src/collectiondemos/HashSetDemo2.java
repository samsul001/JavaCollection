package collectiondemos;

import java.util.HashSet;

public class HashSetDemo2 {

	HashSet <Integer> evenNumber = new HashSet<Integer>();
	HashSet <Integer> numbers = new HashSet<Integer>();
	
	public static void main(String[] args) {
		
		HashSetDemo2 obj = new HashSetDemo2();
		//obj.commonMethods();
		obj.mathConcepts();

	}
	
	public void commonMethods() {
		//Adding elements to evenNumber HashSet
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("After adding elements to evenNumber: "+evenNumber);
		
		//Adding all elements of evenNumber to numbers
		numbers.addAll(evenNumber);
		numbers.add(10);
		System.out.println("After adding elements to numbers: "+numbers);
		
		//remove all
		numbers.removeAll(evenNumber);
		System.out.println("After removing eenNumber HashSet from numbers: "+numbers);
	}
	
	public void mathConcepts() {
		
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(7);
		System.out.println(evenNumber);
		
		numbers.add(2);
		numbers.add(4);
		numbers.add(12);
		numbers.add(7);
		System.out.println(numbers);
		//Union of two collection
		//evenNumber.addAll(numbers);
		//System.out.println("Union of two elements objects: "+evenNumber);
		
		//Intersection of two collection
		//evenNumber.retainAll(numbers);
		//System.out.println("Intersection: "+evenNumber);
		
		//difference
		//evenNumber.removeAll(numbers);
		//numbers.removeAll(evenNumber);
		//System.out.println("difference: "+evenNumber);
		//System.out.println("numbers-evenNumber difference: "+numbers);
		
		//sub set
	
		System.out.println(numbers.containsAll(evenNumber));
		
		
	}

}
