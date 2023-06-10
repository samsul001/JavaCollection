package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {

	ArrayList al = new ArrayList();

	public static void main(String[] args) {

		ArrayListDemo1 alObj = new ArrayListDemo1();
		/*
		alObj.addElements();
		alObj.sizeOfArrayList();
		alObj.removeSingleElement();
		alObj.insertNewElement();
		alObj.getElementFromArrayList();
		//alObj.lastIndex();
		alObj.replaceValueWithNew();
		alObj.searchElements();
		alObj.validatingCollectionEmpty();
		
		alObj.readDataUsingForLoop();
		alObj.readDataUsingForEach();
		alObj.readDataUsingIterator();
		*/
		alObj.addElements();
		alObj.sizeOfArrayList();

	}
	public void ArrayListDeclarationWays() {
		//ArrayList al = new ArrayList(); - Hold hetrogeneous data
		//ArrayList <Integer> al = new ArrayList <Integer>(); - Hold Integer type elements only
		//ArrayList <String> al = new ArrayList<String>(); - Hold group of String type elements only
		//List al = new ArrayList(); - Declaring ArrayList using its parent interface
	}

	@SuppressWarnings("unchecked")
	public void addElements() {

		//Declare ArrayList in 
		al.add("1000");
		al.add("200");
		al.add("100");
		al.add("40af81");
		al.add("af81");
		al.add("af81");
		
		System.out.println(al);
	}
	public void sizeOfArrayList() {
		System.out.println("Number of elements in the ArrayList: "+al.size());
	}

	public void removeSingleElement() {
		al.remove(0);
		System.out.println("After removing element: "+al);
	}

	
	public void insertNewElement() {
		al.add(0, false);
		System.out.println("After ading new element: "+al);
	}
	
	public void getElementFromArrayList() {
		System.out.println("4th index position of arrayList is: "+al.get(4));
	}
	
	public void replaceValueWithNew() {
		al.set(3, "samsul");
		System.out.println("After replacing 3rd index position with New value: "+ al);
	}
	
	public void lastIndex() {
		int lastIndex=al.lastIndexOf(al);
		System.out.println("last index of arraylist is: "+lastIndex);
	}
	
	public void searchElements() {
		System.out.println("searching element is present: " +al.contains(1.12));
	}
	
	public void validatingCollectionEmpty() {
		System.out.println("arrayList is empty ? : "+al.isEmpty());
	}

	public void readDataUsingForLoop() {
		System.out.println("*********************For loop*********************");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
	
	public void readDataUsingForEach() {
		System.out.println("*********************ForEach loop*********************");
		for(Object e:al) {
			System.out.println(e);
		}
	}
	
	public void readDataUsingIterator() {
		System.out.println("*********************Iterator loop*********************");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
