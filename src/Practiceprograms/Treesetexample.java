package Practiceprograms;

import java.util.TreeSet;

public class Treesetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> treeSet= new TreeSet<Integer>();
		
		treeSet.add(2);
		
		treeSet.add(3);
		
		treeSet.add(4);
		
		treeSet.add(5);
		
		treeSet.add(6);
		
		System.out.println(treeSet);
		
		System.out.println(treeSet.first());
		
		System.out.println(treeSet.isEmpty());
		
		System.out.println(treeSet.remove(6));
		
		System.out.println(treeSet.tailSet(5));
		
		System.out.println(treeSet.headSet(3));
		
		
	}

}
