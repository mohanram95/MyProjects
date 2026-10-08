package Practiceprograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Findthemissingalphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a";
		
		s=s.toLowerCase();
		
	String[] given=	s.split("");
	
	String[] alphabet="abcdefghijklmnopqrstuvwxyz".split("");
	
	HashSet<String> array1=new HashSet<String>(Arrays.asList(given));
	
	HashSet<String> array2= new HashSet<String>(Arrays.asList(alphabet));
	
	array2.removeAll(array1);
	
	System.out.println(array2);
	}

}
