package collectiondemos;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemos1 {
	
	Hashtable<Integer,String> hs = new Hashtable<Integer,String>();
	Hashtable hss = new Hashtable();
	

	public static void main(String[] args) {
		HashTableDemos1 obj =new HashTableDemos1();
		obj.commonMethods();

	}
	
	public void declarationWays() {
		Hashtable hs = new Hashtable();
		Hashtable hs1 = new Hashtable(100); //initial capacity is 11, can increase
		Hashtable hs2 = new Hashtable(100,(float) 0.85); //capacity & load factor
		
	}
	
	public void commonMethods() {
		//adding elements to hashtable		
		hs.put(102, "Kohli");
		hs.put(103, "Rohit");
		hs.put(104, "Ashwin");
		hs.put(101, "Dhoni");
		hs.put(106, "Ashwin");
		hs.put(101, "MS Dhoni");
		//hs.put(null, "string"); //NullPointerException
		//hs.put(106, null); //NullPointerException
		System.out.println("After adding elements to hs: "+ hs);
		
		//to get value of a key in hashtable
		System.out.println(hs.get(101));
		System.out.println(hs.get(104));
		System.out.println(hs.get(106));
		
		//To remove a pair from hashtable
		hs.remove(106);
		System.out.println("After removing an entry: "+hs);
		
		//To search keys in hashTable
		System.out.println(hs.containsKey(102));
		System.out.println(hs.containsKey(106));
		
		//To search values in hashTable
		System.out.println(hs.containsValue("Dhoni"));
		System.out.println(hs.containsValue("Rohit"));
		
		//Validating empty hashtable
		System.out.println(hss.isEmpty());
		
		//To return key set values from hashtable
		System.out.println("************for-each loop for extract keys************");		
		for(int val:hs.keySet()) {
			System.out.println(val);
		}
		System.out.println("************Iterator loop for extract keys************");
		Set s = hs.keySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//To return values of key in hashtable
		System.out.println("************for-each loop for extract values************");
		for(String val1:hs.values()) {
			System.out.println(val1);
		}
		System.out.println("************Iterator loop for extract Values************");
		Collection col = hs.values();
		Iterator itrr = col.iterator();
		while(itrr.hasNext()) {
			System.out.println(itrr.next());
		}
		
		//To return key, value pairs
		System.out.println("************for-each loop for extract key value pairs************");
		for(int val4:hs.keySet()) {
			System.out.println(val4+"    "+hs.get(val4));
		}
		
		//Entry Interface methods
		System.out.println("************for-each loop for extract key value pairs(Entry Methods)************");
		for(Map.Entry entry : hs.entrySet()) {
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		System.out.println("************Itrator loop for extract key value pairs(Entry Methods)************");
		Set se = hs.entrySet();
		Iterator dd = se.iterator();
		while(dd.hasNext()) {
			Map.Entry entry = (Entry) dd.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
	}
}
	

