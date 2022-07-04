package map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {
	
	/*
	 * Map interface: It is a separate interface, not part of collection interface.
	 * It is a collection of entry sets. And an entry set is a combination of key & value pair.
	 * When we should use Map:
	 * -* When data needs to be represent in form of key-value pair.
	 * -* Key's can't be duplicate, but values can be duplicate.
	 * -* Insertion order is not preserved.
	 * -* Following classes are implementing the Map interface:
	 * 1. HashMap (class)
	 * -* null key only allowed once, null values can be multiple.
	 * -* We should use it, when there are more number of search operations.
	 * 
	 * HashMap class is having an interface called Entry interface to work on individual entery sets.
	 */

	public static void main(String[] args) {
		
		//HashMap declaration
		Hash_Map hMap1 = new Hash_Map(); //It can have heterogeneous type of data
		
		HashMap <Integer,String> hMap = new HashMap <Integer,String>(); //It can have String type of Keys & Integer type of values.
		
		// put(key,value) method: Add a new object or entry set to Hash map
		hMap.put(100, "Smith");
		hMap.put(101, "John");
		hMap.put(102, "David");
		hMap.put(103, "Scott");
		hMap.put(104, "Smith");
		hMap.put(105, "Steve");

		System.out.println(hMap);
		
		//Adding duplicate value: No issues.
		hMap.put(106, "John");
		System.out.println(hMap);
		
		//Adding duplicate keys: It won't add, instead it will update the value of the key.
		hMap.put(106,"Leena");
		System.out.println(hMap);
		
		//size(): returns number of entrySets.
		System.out.println(hMap.size());
		
		//Get the value of any Key
		System.out.println(hMap.get(103));
		
		//Remove any key & it's value
		hMap.remove(106);
		System.out.println(hMap);
		
		//Check if a key is present in HashMap or not
		System.out.println(hMap.containsKey(103));
		System.out.println(hMap.containsKey(106));
		
		//Check if a value is present in HashMap or not
		System.out.println(hMap.containsValue("John"));
		
		//Check if HasMap is empty or not
		System.out.println(hMap.isEmpty());
		
		//Get all the keys from HashMap: 
		System.out.println(hMap.keySet());  //It will return a Set object, where duplicates are not allowed.
		//Read all the keys from HasMap
		for(int e:hMap.keySet()) {
			System.out.println(e);
		}
		
		//Get all the values from HashMap
		System.out.println(hMap.values()); //It will just return a collection, where duplicates are allowed.
		//Read all the values from HasMap
		Iterator itr = hMap.values().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//entrySet(): Returns all the entry sets as Set object.
		System.out.println(hMap.entrySet());
				
		//Read all the keys & their values from HashMap
		for(int e:hMap.keySet()) {
			System.out.println("Key = "+e+" and value = "+hMap.get(e));
		}
		
		//Entry interface method: There is an entry interface as a subset of HashMap interface, that works for specific entry inside Hash map
		
		//Get all the entries from HashMap
		System.out.println(hMap.entrySet()); // It will return a Set.
		//Read all the entries from HasMap using iterator
		Iterator itr2 = hMap.entrySet().iterator();
		while(itr2.hasNext()) {
			//System.out.println(itr2.next());
			Entry entry =(Entry) itr2.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		//Read all the entries from HasMap using for each loop
		for(Entry e:hMap.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		//putAll(Another HashMap): Add another map to HashMap.
		HashMap <Integer,String> hMap2 = new HashMap <Integer,String>();
		hMap2.put(100, "Smith");
		hMap2.put(101, "John");
		hMap2.put(102, "David");
		HashMap <Integer,String> hMap3 = new HashMap <Integer,String>();
		hMap3.put(103, "Scott");
		hMap3.put(104, "Smith");
		hMap3.put(105, "Steve");
		System.out.println(hMap2);
		hMap2.putAll(hMap3);
		System.out.println(hMap2);
		
		//clear(): clear all the entrySets from HashMap.
		System.out.println("hMap3 is "+hMap3);
		hMap3.clear();
		System.out.println("After clear hMap3 is "+hMap3);
		
		


	}

}
