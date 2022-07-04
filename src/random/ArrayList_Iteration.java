package random;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Iteration {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pradeep");
		al.add("Richa");
		al.add("Aadvik");
		al.add("Neeshu");
		al.add("Rooma");
		al.add("Ankit");
		al.add("Avani");
		
		System.out.println("----------Iterate ArrayList using for each loop--------------");
		for(String s:al) {
			System.out.println(s);
		}
		
		System.out.println("----------Iterate ArrayList using Iterator--------------");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------Iterate ArrayList using for loop-----------------");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("------Iterate ArrayList using ListIterator with backword direction-----------------");
		ListIterator<String> listItr1 = al.listIterator(al.size());
		while(listItr1.hasPrevious()) {
			System.out.println(listItr1.previous());
		}
		
		System.out.println("------Iterate ArrayList using for each loop & lambda expression-----------------");
		al.forEach(s -> {
			System.out.println(s);
		});
		
		System.out.println("-----Using Iterator & forEachRemaining with lambda expression------------------");
		//Using Iterator & forEachRemaining with lambda expression
		itr = al.iterator();
		itr.forEachRemaining(s ->{
			System.out.println(s);
		});

	}

}
