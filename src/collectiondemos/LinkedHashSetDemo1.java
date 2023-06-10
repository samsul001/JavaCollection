package collectiondemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
	
	HashSet hs = new HashSet();
	LinkedHashSet ls = new LinkedHashSet();

	public static void main(String[] args) {
		LinkedHashSetDemo1 obj = new  LinkedHashSetDemo1();
		obj.commonMehods();						 
	}
	
	public void commonMehods() {
		//adding elements to HashSet
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		System.out.println("HashSet: "+hs);
		
		ls.add(100);
		ls.add(200);
		ls.add(300);
		ls.add(400);
		System.out.println("Linked hashset: "+ls);
		
		//***************LinkedHashSet is applicable for all methods explained for HashSet***********************
	}

}
