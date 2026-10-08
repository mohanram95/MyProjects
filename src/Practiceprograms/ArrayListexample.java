package Practiceprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListexample
{

  
  
  
   
	public static void main(String[] args) 
	{
		List<String> arraylist= new ArrayList<String>();
		
		arraylist.add("Volvo");
		
		arraylist.add("BMW");
		
		arraylist.add("Maruthi");
		
		arraylist.add("Tata");
		
		arraylist.add("Benz");
		
	  arraylist.add("Benz");
		
		System.err.println(arraylist);
		
		System.out.println(arraylist.indexOf("Maruthi"));
		
		System.out.println(arraylist.lastIndexOf("Benz"));
		
		System.out.println(arraylist.get(1));
		
	    List<String> anotherlist= new ArrayList<String>();
	    
	    anotherlist.addAll(arraylist);
	    
	    System.out.println(anotherlist);
	 arraylist.remove(5);
	 
	 System.out.println(arraylist);
	 
	 
	 for(int i=0;i<arraylist.size();i++)
	 {
		 System.out.println(arraylist.get(i));
	 }
	 
	 for (String string : anotherlist)
	 {
		System.out.println(string);
	}
		
		
	}

}
