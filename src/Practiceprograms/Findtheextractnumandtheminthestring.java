package Practiceprograms;

public class Findtheextractnumandtheminthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Mohan123";
		
		int total=0;
		
		for(int i=0;i<s.length();i++)
		{
	char c=	s.charAt(i);
	
	if(Character.isDigit(c))
	{
		total=total+Character.getNumericValue(c);
	}
		}
		
		System.out.println(total);

	}

}
