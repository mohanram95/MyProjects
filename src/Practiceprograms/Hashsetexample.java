package Practiceprograms;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> set= new HashSet<String>();
		
		set.add("A");
		
		set.add("E");
		
		set.add("I");
		
		set.add("O");
		
	    set.add("U");
	    
	    
	    System.out.println(set);
	    
	    set.remove("O");
	    
	    
	 Iterator<String> iterator= set.iterator();
	 
	 while (iterator.hasNext()) {
		System.out.println(iterator.next());;
		
	}
	    
	   
	    
	    
	    
	    
		
	}

}
