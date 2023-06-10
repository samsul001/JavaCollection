package collectiondemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo2 {
	
	ArrayList lang = new ArrayList();
	ArrayList prgrm = new ArrayList();
	
	String arr[] = {"Selenium","Appium","UFT"};

	public static void main(String[] args) {
		ArrayListDemo2 langObj = new ArrayListDemo2();
		langObj.addSingleElements();
		langObj.addMultiElement();
		langObj.insertNewElement();
		langObj.replaceElement();
		langObj.methodsFromCollections();
		langObj.convertString();
	}
	
	public void addSingleElements() {
		lang.add(100);
		lang.add("Java");
		lang.add("red");
		lang.add("C");
		System.out.println("Adfter adding element to lang: "+ lang);
	}
	
	public void addMultiElement() {
		
		prgrm.addAll(lang);
		System.out.println("after adding all elements from lang to prgrm: "+prgrm);
	}
	
	public void insertNewElement() {
		prgrm.add(2, "welcome");
		prgrm.add(3, "C");
		System.out.println("After inserting new element to prgrm: "+prgrm);
	}
	
	public void replaceElement() {
		lang.set(0, "C#");
		prgrm.set(0, "Selenium");
		System.out.println("After replacing new element to lang: "+lang);
		System.out.println("After replacing new element to prgrm: "+prgrm);
	}
	
	public void methodsFromCollections() {
		Collections.sort(lang);
		Collections.sort(prgrm);
		System.out.println("after sorting lang list: "+lang);
		System.out.println("after sorting prrm list: "+prgrm);
		
		Collections.sort(lang, Collections.reverseOrder());
		Collections.sort(prgrm, Collections.reverseOrder());		
		System.out.println("After reversion lang & prgrm lists ==> "+ lang + "  &  "+prgrm);
		
		Collections.shuffle(lang);
		Collections.shuffle(prgrm);
		System.out.println("After shuffling ==> "+ lang + "  &  "+prgrm);
		
	}
	
	public void convertString() {
		ArrayList arrList = new ArrayList(Arrays.asList(arr));
		System.out.println(arrList);
		
	}

}
