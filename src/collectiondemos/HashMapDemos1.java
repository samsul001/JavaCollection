package collectiondemos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemos1 {
	
	HashMap<Integer,String> m = new HashMap<Integer,String>();
	//HashMap m1 = new HashMap();

	public static void main(String[] args) {
		HashMapDemos1 obj = new HashMapDemos1();
		obj.commonMethods();

	}
	
	public void declarationWays() {
		//HashMap m1 = new HashMap<>();
		//HashMap<Integer,String> m2 = new HashMap<Integer,String>();
		//Map m3 = new HashMap();
		
	}
	
	public void commonMethods() {
		//adding elements to Map
		m.put(101, "red");
		m.put(102, "Yellow");
		m.put(103, "White");
		m.put(104, "Blue");
		m.put(105, "red");
		m.put(102, "Brown");
		System.out.println("After adding all entries into m HashMap: "+ m);
		
		//To get value of a key
		System.out.println(m.get(102));
		System.out.println(m.get(103));
		
		//To remove value from HaSHmAP
		m.remove(103);
		System.out.println("After removing a data from HashMap: "+m);
		
		//To search key, value pairs in HashMap
		System.out.println("Key 101 is present: "+m.containsKey(101));
		System.out.println("red is present in HashMap: "+m.containsValue("red"));
		
		//To return all keys as set
		System.out.println(m.keySet());
		
		System.out.println("**********For each loop***********");
		for(Object val:m.keySet()) {
			System.out.println(val);
		}
		
		System.out.println("**********Iterator loop***********");
		Set s = m.keySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//To return all values from HashMap as Object
		System.out.println(m.values());
		
		System.out.println("**********For each loop***********");
		for(Object e:m.values()) {
			System.out.println(e);
		}
		
		System.out.println("**********Iterator loop***********");
	    Collection o = m.values();
		Iterator itr = o.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//To return both key , value pairs
		System.out.println("**********For each loop***********");
		for(Object i:m.keySet()) {
			System.out.println(i+ "   "+m.get(i));
		}
		
		//To return both key value pairs
		//Entry methods
		//*************
		
		System.out.println("**********For each loop(Entry methods)***********");
		for(Map.Entry entry:m.entrySet()) {
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		System.out.println("**********Iterator loop(Entry methods)***********");
		Set ss = m.entrySet();
		Iterator cv = ss.iterator();
		while(cv.hasNext()) {
			Map.Entry entry = (Entry) cv.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
	}
	
	

}
