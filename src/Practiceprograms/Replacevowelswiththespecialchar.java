package Practiceprograms;

public class Replacevowelswiththespecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Mohanram";
		
	char[] givenarray=	s.toCharArray();
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||
				s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			
			givenarray[i]='*';

	}
	for(int i=0;i<s.length();i++)
	{
		System.out.print(givenarray[i]);
	}
			
	}
	}


