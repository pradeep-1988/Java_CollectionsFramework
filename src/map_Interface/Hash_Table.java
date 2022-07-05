package map_Interface;

import java.util.Hashtable;

public class Hash_Table {
	
	/*
	 * 2. HashTable (class)
	 * - It is synchronized i.e thread safe. Only one thread is allowed at a time. Poor performance.
	 * - null is not allowed as key as well as values.
	 */

	public static void main(String[] args) {
		
		Hashtable htable1 = new Hashtable(); //default capacity is 11 & load factor is 0.75 (these are configurable)
		Hashtable ht1 = new Hashtable(100,(float) 0.95); // Now capacity is 100, load factor is 0.95
		
		Hashtable<Integer,String> hTable = new Hashtable<Integer,String>();
		
		//Add entry set to hashtable
		hTable.put(101, "John");
		hTable.put(102, "David");
		hTable.put(103, "Scott");
		hTable.put(104, "Smith");
		hTable.put(105, "Steve");
		//hTable.put(null, "Aviral"); // NullPointerException as null keys are not allowed.
		//hTable.put(106, null);  // NullPointerException as null values are not allowed.
		
		System.out.println(hTable);
		
		
		//Get the value of a key
		System.out.println(hTable.get(103));
				
		//Remove a key
		hTable.remove(103);
		System.out.println(hTable);

	}

}
