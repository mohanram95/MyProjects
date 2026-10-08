package Practiceprograms;

import java.util.HashMap;

public class Hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashmap= new HashMap<Integer, String>();
		
		hashmap.put(1, "Mohan");
		
		hashmap.put(2, "Ram");
		
		hashmap.put(3, "Rai");
		
		hashmap.put(4, "tamil");
		
		
		System.out.println(hashmap);
		
		HashMap<Integer, String> duplicatemap= new HashMap<Integer, String>();
		
		duplicatemap.putAll(hashmap);
		
		
		System.out.println(duplicatemap);
		
		
		hashmap.containsKey(1);
		
		hashmap.containsValue("rai");
		
		
		hashmap.keySet();
		
		
		
		System.out.println(hashmap);
	}

}
