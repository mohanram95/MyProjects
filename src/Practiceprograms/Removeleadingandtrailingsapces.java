package Practiceprograms;

public class Removeleadingandtrailingsapces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=" I love myammu";
		
		//System.out.println(s.trim());
		
		//System.out.println(s.strip());
		
		System.out.println(s.replaceAll("^[ \t]+|[ \t]+$","	"));
	}

}
