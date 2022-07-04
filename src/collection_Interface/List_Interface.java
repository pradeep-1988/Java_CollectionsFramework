package collection_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_Interface {
	
	
	/*
	 * When to use list interface
	 * 1. When Insertion order is preserved i.e. list maintains the ordering.
	 * 2. When Duplicates are allowed
	 * 3. When Null elements are allowed.
	 * List interface has following classes that implements list interface:
	 * - ArrayList class. When to use ArrayList:
	 * -* We should go for ArrayList, when there are more/frequent number of retrieving operations.
	 * -* ArrayList internally uses a dynamic array to store the elements.
	 * -* As it internally uses Array, Manipulation with ArrayList is slow, because if any element is inserted/removed 
	 * 	  from the Array, all the bits are shifted in memory.
	 * -* ArrayList is better for storing & accessing the data.
	 * 
	 * - LinkedList class. When to use LinkedList:
	 * -* We should go for LinkedList, when there are more/frequent number of insertion/deletion operations.
	 * -* LinkedList internally uses a doubly linked list to store the elements.
	 * -* As it internally uses doubly linked list, Manipulation with linkedlist is faster, because any element is
	 * 	  inserted/removed, no bit shifting is required in memory.
	 * -* Linkedlist is better for manipulating data.
	 */

	public static void main(String[] args) {
		
		CallArrayList();
		CallLinkedList();
				
	}
	
	public static void CallLinkedList() {
		
		//Linked List declaration:
		LinkedList ll = new LinkedList(); //It can contains heterogeneous data, But not recommended, instead use object type to server the same purpose.
		ll.add(100);
		ll.add("Welcome");
		ll.add(15.5);
		ll.add('A');
		ll.add(true);
		ll.add(null);
		System.out.println(ll);
		
		LinkedList<Object> LLObj = new LinkedList<Object>(); //It can also contains heterogeneous data types.
		LLObj.add(100);
		LLObj.add("Welcome");
		LLObj.add(15.5);
		LLObj.add('A');
		LLObj.add(true);
		LLObj.add(null);
		System.out.println(LLObj);
		
		LinkedList<String> ll1 = new LinkedList<String>(); //it can contains only string data types
		LinkedList<Integer> ll2 = new LinkedList<Integer>(); //it can contains only integer data types
		List<String> ll3 = new LinkedList<String>(); //List is parent interface, so we can declare linkedList in this way as well.
		
		LinkedList<Object> lList = new LinkedList<Object>();
		lList.add(100);
		lList.add("Hello");
		lList.add(15.5);
		lList.add('A');
		lList.add('A');
		lList.add(true);
		lList.add(false);
		lList.add(null);
		lList.add(100);
		System.out.println(lList);
		
		//Get the size
		System.out.println(lList.size());
		
		//Remove an element
		lList.remove(6); // It will remove an element from 6th index
		System.out.println("After removing element from 6th index: "+lList);
		lList.remove(); // it will remove the head i.e. first element.
		System.out.println("After removing the head i.e. 1st element: "+lList);
		lList.remove(null);
		System.out.println("After removing the specified element i.e. null "+lList);
		
		//Add an element
		lList.add(123); // it will add an element at the end.
		System.out.println("After adding an element to the end: "+lList);
		lList.add(3, false); // it will add an element at specified index
		System.out.println("After adding an element at specified index: "+lList);

		//Retrieving an element from LinkedList
		System.out.println(lList.get(7));
		
		//Change or replace the element at any index
		lList.set(3, "welcome");
		System.out.println("After replacing the element at index 3: "+lList);
		
		//Check if an element exist in LinkedList
		System.out.println(lList.contains(null));
				
		//Check if LinkedList is empty or not
		System.out.println(lList.isEmpty());
		
		//Add multiple objects or another collection to LinkedList
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Hello");
		strList.add("My");
		strList.add("Name");
		strList.add("Is");
		strList.add("Pradeep");
		strList.add("Kumar");
		
		lList.addAll(strList);
		System.out.println("After adding another collection to LinkedList: "+lList);
		
		//Remove multiple elements from LinkedList
		lList.removeAll(strList);
		System.out.println("After removing another collection from LinkedList: "+lList);
		
		//Sort a LinkedList in ascending order
		System.out.println("Before sort: "+strList);
		Collections.sort(strList);
		System.out.println("After sort in ascending order: "+strList);
		
		//Shuffle a LinkedList
		Collections.shuffle(strList);
		System.out.println("After shuffle: "+strList);
		
		//Sort a LinkedList in ascending order
		Collections.sort(strList,Collections.reverseOrder());
		System.out.println("After sort in descending order: "+strList);
		
		//Add element to first & last position.
		lList.addFirst("Hello");
		lList.addLast("Jakhar");
		System.out.println("After adding first & last element: "+lList);
				
		//Get first & last element from linkedList
		System.out.println(lList.getFirst());
		System.out.println(lList.getLast());

		//Remove first & last element from linkedList
		lList.removeFirst();
		lList.removeLast();
		System.out.println("After removing first & last element: "+lList);
		
		//Iterate the LinkedList using simple for loop
		System.out.println("-----------------Iterate the LinkedList using simple for loop--------------");
		for(int i=0;i<lList.size();i++) {
			System.out.println(lList.get(i));
		}
		
		//Iterate the LinkedList using for each loop
		System.out.println("-----------------Iterate the LinkedList using for each loop-----------------");
		for(Object e:lList) {
			System.out.println(e);
		}
		
		//Iterate the LinkedList using Iterator interface
		System.out.println("-------------Iterate the LinkedList using Iterator interface-----------");
		Iterator itr = lList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
				
	}
	
	
	public static void CallArrayList() {
				
				//Array List declaration:
				ArrayList al1 = new ArrayList(); //It can contains heterogeneous data types. But it is not recommended, instead use object type to server the same purpose.
				al1.add(100);
				al1.add("Welcome");
				al1.add(15.5);
				al1.add('A');
				al1.add(true);
				al1.add(null);
				System.out.println(al1);
				
				ArrayList<Object> ALObj = new ArrayList<Object>(); //It can also contains heterogeneous data types.
				ALObj.add(100);
				ALObj.add("Welcome");
				ALObj.add(15.5);
				ALObj.add('A');
				ALObj.add(true);
				ALObj.add(null);
				
				ArrayList<Integer> al2 = new ArrayList<Integer>(); //It can contains only Integer data types.
				ArrayList<String> al3 = new ArrayList<String>(); //It can contains only String data types.
				List<String> al4 = new ArrayList<String>(); //List is parent interface, so we can also create an ArrayList in this way.
				
				
				ArrayList<String> studentsName = new ArrayList<String>();
				studentsName.add("Rakesh");
				studentsName.add("Rahul");
				studentsName.add("Monu");
				studentsName.add("Neeshu");
				System.out.println(studentsName);
				
				//Add elements to the ArrayList collection at the end.
				studentsName.add("Richa");
				System.out.println(studentsName);
				
				//Add element at any specific index to an ArrayList collection.
				studentsName.add(2, "Pradeep");
				System.out.println(studentsName);
				
				// Add another collection to an ArrayList collection.
				List<String> newStdList = new ArrayList<String>();
				newStdList.add("ABC123");
				newStdList.add("Helllo");
				
				studentsName.addAll(newStdList);
				System.out.println(studentsName);
				
				// Get an element from a specified index.
				System.out.println(studentsName.get(4));
				
				// remove an specified element from ArrayList.
				studentsName.remove("ABC123");
				System.out.println(studentsName);
				
				// remove an element from a specified index
				studentsName.remove(5);
				System.out.println(studentsName);
				
				// remove all the elements from the ArrayList.
				//studentsName.clear();
				//System.out.println(studentsName);
				
				//Replace an element with specified index
				studentsName.set(2, "Ankit");
				System.out.println(studentsName);
				
				//Check if an element exist in ArrayList
				System.out.println(studentsName.contains("Monu"));
				
				//Check if ArrayList collection is empty or not.
				System.out.println(studentsName.isEmpty());
				
				//Check the size of ArrayList collection.
				System.out.println(studentsName.size());
				
				//Sort the ArrayList
				System.out.println("Before sort: "+studentsName);
				Collections.sort(studentsName);
				System.out.println("After sort in ascending order: "+studentsName);
				
				//Shuffle the elements of ArrayLIst
				Collections.shuffle(studentsName);
				System.out.println("After shuffling: "+studentsName);
				
				//Sort the ArrayList in desending order
				Collections.sort(studentsName,Collections.reverseOrder());
				System.out.println("After sort in descending order: "+studentsName);
				
				//Convert an Array to ArrayList
				String[] strArray = {"Dog","Elephant","Cat","cow"};
				ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(strArray));
				System.out.println(arrList);
				
				//Iterate an ArrayList collection with simple for loop
				for(int i=0;i<studentsName.size();i++) {
					System.out.println(studentsName.get(i));
				}
				System.out.println("-----------------------------------------------------");

				//Iterate an ArrayList collection with for each loop
				for(String any: studentsName) {
					System.out.println(any);
				}
				System.out.println("-----------------------------------------------------");
				
				//Iterate an ArrayList collection with Iterator interface.
				Iterator<String> it = studentsName.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
	}

}
