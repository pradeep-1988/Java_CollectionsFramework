package collection_Interface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Interface {
	
	/*
	 * When to use queue interface
	 * 1. When objects of a group are prior to processing i.e. FIFO principle..
	 * 
	 * Queue interface has following classes that implements queue interface:
	 * - PriorityQueue class: In priority queue, new element added from tail position. and element return from head position.
	 * When to use it
	 * -* When Insertion order is preserved.
	 * -* Duplicates are allowed.
	 * -* Heterogeneous data is not allowed.
	 * 
	 * - LinkedList class: Already covered in list interface
	 */

	public static void main(String[] args) {
		
		
		//Priority Queue declaration:
		PriorityQueue<String> pQue1 = new PriorityQueue<String>(); //it can contains only string data types
		PriorityQueue<Integer> pQue2 = new PriorityQueue<Integer>(); //it can contains only integer data types
		Queue<String> pQue3 = new PriorityQueue<String>(); //Queue is parent interface, so we can declare PriorityQueue in this way as well.
				
		
		PriorityQueue<Character> pQue = new PriorityQueue<Character>();

		//Adding elements with add() & offer() methods.
		//If adding element is unsuccessful, then add() method will return exception, but offer() method return false.
		pQue.add('A');
		pQue.add('B');
		pQue.add('C');
		pQue.add('D');
		pQue.offer('D');
		System.out.println(pQue);
		
		
		//Get head element with element() method and peak() method
		System.out.println(pQue.element());
		System.out.println(pQue.peek());
		// If PriorityQueue is empty then 
		// element() method will throw NoSuchElementException
		// but peak() method will throw null.
		PriorityQueue EmptyQue = new PriorityQueue<>();
		//System.out.println(EmptyQue.element());  
		System.out.println(EmptyQue.peek());
		
		
		// Return & remove head element from PriorityQueue with remove() & poll() method.
		System.out.println(pQue.remove());
		System.out.println(pQue);
		System.out.println(pQue.poll());
		System.out.println(pQue);
		
		/*
		//If PriorityQueue is empty, then remove() method will throw NoSuchElementException, 
		//but poll() method will throw null.
		PriorityQueue pQue1 = new PriorityQueue<>();
		System.out.println(pQue1.remove());
		System.out.println(pQue1.poll());  
		 */
		
		//Iterate the prioroty queue
		System.out.println("-----------------Iterate the PriorityQueue using iterator interface-----------------");
		Iterator itr =pQue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
				
		System.out.println("-----------------Iterate the PriorityQueue using for each loop-----------------");
		for(Object e:pQue) {
			System.out.println(e);
		}

	}

}
