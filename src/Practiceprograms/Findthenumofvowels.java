package Practiceprograms;

public class Findthenumofvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Mohanram";
		
		int count=0;
		
		s=s.toLowerCase();
		
	//int length=	s.length();
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			count++;
		}
	}
	
	System.out.println(count);
	}

}
