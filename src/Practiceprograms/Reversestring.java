package Practiceprograms;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Mohanraman";
		
	//	1 method
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
//		//stringbuffer 
////		StringBuffer buffer= new StringBuffer();
////		
////		buffer.append(s);
////		
////		System.out.println(buffer.reverse());
//		
//		//stringbuilder
//		
//		StringBuilder builder= new StringBuilder();
//		
//		builder.append(s);
//		
//		System.out.println(builder.reverse());
	}

}
