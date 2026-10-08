package Practiceprograms;

public class Lowercaseanduppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//tolowercase
//		String s="I LOVE MYAMMU";
//		
//	  char[] chararray=  s.toCharArray();
//	  
//	  for(int i=0;i<s.length();i++)
//	  {
//		  if(chararray[i]>=65&&chararray[i]<=90)
//		  {
//			  chararray[i]=(char) (chararray[i]+32);
//		  }
//	  }
//	  for(int i=0;i<chararray.length;i++)
//	  {
//		  System.out.print(chararray[i]);
//	  }
		
		//touppercase
		
		String s="i love myammu";
		
	char[] chararray=	s.toCharArray();
	
	for(int i=0;i<s.length();i++)
	{
		if(chararray[i]>=97&&chararray[i]<=122)
		{
			chararray[i]=(char) (chararray[i]-32);
		}
	}
	for(int i=0;i<chararray.length;i++)
	{
		System.out.print(chararray[i]);
	}
	}

}
