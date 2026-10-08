package Practiceprograms;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> linkedlist= new LinkedList<Integer>();
		
		linkedlist.add(2);
		
		linkedlist.add(3);
		
		linkedlist.add(4);
		
		linkedlist.add(5);
		
		System.out.println(linkedlist);
		
	linkedlist.addFirst(1);
	
	linkedlist.addLast(6);
	
	System.out.println(linkedlist);
	
	linkedlist.removeFirst();
	
	linkedlist.removeLast();
	
	System.out.println(linkedlist);
	}

}
