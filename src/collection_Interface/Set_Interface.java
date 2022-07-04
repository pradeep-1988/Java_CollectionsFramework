package collection_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_Interface {
	
	/*
	 * Set Interface, we should use
	 * 1. when insertion order is not preserved. No index concept here.
	 * 2. Duplicate elements are not allowed.
	 * 3. Null element is allowed.
	 * 
	 * Set interface has following classes that implements set interface:
	 * - HashSet class
	 * -* We should go for it, when there is more no of searching/retrieving operation.
	 * 
	 * - LinkedHashSet: Insertion order is preserved.
	 */

	public static void main(String[] args) {
		
		CallHashSet();
		CallLinkedHashSet();
		

	}
	
	public static void CallHashSet() {
		//Declare a HashSet
				HashSet hs = new HashSet(); // It can contains heterogeneous data type. default size is 16 & Load factor or fill ratio is 0.75. t means, when HasHset object is 75% filled it creates another HashSet object into the memory and point to that.
				HashSet hs1 = new HashSet(100);  // Initial size is 100 & fill ration is 0.75.
				HashSet hs2 = new HashSet(100,(float) 0.90); // Initial size is 100 & fill ration is 0.90.
				HashSet<String> hs3 = new HashSet<String>(); //It can contains only String data type
				HashSet<Integer> hs4 = new HashSet<Integer>(); //It can contains only integer data type
				
				HashSet hSet = new HashSet();
				hSet.add("Hello");
				hSet.add(100);
				hSet.add(15.5);
				hSet.add('A');
				hSet.add('A');
				hSet.add(true);
				hSet.add(false);
				hSet.add(null);
				hSet.add(100);
				
				System.out.println(hSet);
				
				//Size of HashSet
				System.out.println(hSet.size());
						
				//Remove element
				hSet.remove(true);
				System.out.println("After removing true from hsahSet: "+hSet);
						
				//Check if an element exist or not
				System.out.println(hSet.contains(15.5));
						
				//Check if HashSet is empty or not
				System.out.println(hSet.isEmpty());
				
				//Reading element from HashSet (We can't use simple for loop as index not available for HashSet)
				
				System.out.println("-------------Iterate the HashSet using for each loop-----------");
				for(Object e: hSet) {
					System.out.println(e);
				}
				
				System.out.println("-------------Iterate the HashSet using Iterator interface-----------");
				Iterator itr =hSet.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println("----------------------------------------------------------");
				HashSet<String> strHashSet = new HashSet<String>();
				strHashSet.add("Hello");
				strHashSet.add("My");
				strHashSet.add("Name");
				strHashSet.add("Is");
				strHashSet.add("Pradeep");
				strHashSet.add("Kumar");
				
				//Add another collection to HashSet
				hSet.addAll(strHashSet);
				System.out.println(hSet);
						
				//Remove another collection from hashSet
				hSet.removeAll(strHashSet);
				System.out.println(hSet);
				System.out.println("----------------------------------------------------------");
				
				HashSet<Integer> set1 = new HashSet<Integer>();
				set1.add(1);
				set1.add(2);
				set1.add(3);
				set1.add(4);
				set1.add(5);
				set1.add(6);
				
				System.out.println("Set1 is: "+set1);
				
				HashSet<Integer> set2 = new HashSet<Integer>();
				set2.add(4);
				set2.add(5);
				set2.add(6);
				set2.add(7);
				System.out.println("Set2 is: "+set2);
				
				//Union: Get all the elements from both the collections (No duplicates allowed)
				set1.addAll(set2); //Add all the elements from set2 to set1
				System.out.println("Union for Set1 & Set2 is "+set1);
				
				System.out.println("----------------------------------------------------------");
				
				HashSet<Integer> set3 = new HashSet<Integer>();
				set3.add(1);
				set3.add(2);
				set3.add(3);
				set3.add(4);
				set3.add(5);
				set3.add(6);
				
				System.out.println("Set3 is: "+set3);
				
				HashSet<Integer> set4 = new HashSet<Integer>();
				set4.add(4);
				set4.add(5);
				set4.add(6);
				set4.add(7);
				System.out.println("Set4 is: "+set4);
				//Intersection: Get all the elements which are common in both the collections.
				set3.retainAll(set4); //remove all the elements from set3 except the elements which are are part of set4.
				System.out.println("Intersection for Set3 & Set4 is "+set3);
				
				System.out.println("----------------------------------------------------------");
				
				HashSet<Integer> set5 = new HashSet<Integer>();
				set5.add(1);
				set5.add(2);
				set5.add(3);
				set5.add(4);
				set5.add(5);
				set5.add(6);
				
				System.out.println("Set5 is: "+set5);
				
				HashSet<Integer> set6 = new HashSet<Integer>();
				set6.add(4);
				set6.add(5);
				set6.add(6);
				set6.add(7);
				System.out.println("Set6 is: "+set6);
				
				//Difference: Get the difference from two collections.
				set5.removeAll(set6); //remove only the elements from set5 which are part of set6.
				System.out.println("Difference for Set5 & Set5 is "+set5);
	}
	
	public static void CallLinkedHashSet() {
		
		//LinkedHashSet: Insertion order is preserved.
		
		LinkedHashSet lSet = new LinkedHashSet();
		lSet.add("Hello");
		lSet.add(100);
		lSet.add(15.5);
		lSet.add('A');
		lSet.add('A');
		lSet.add(true);
		lSet.add(false);
		lSet.add(null);
		lSet.add(100);
				
		System.out.println("LinkedHashSet: Insertion order is preserved: "+lSet);
	}

}
