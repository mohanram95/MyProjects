package Practiceprograms;

public class Revthesentenceinthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I love myammu";
		
		String rev="";
		
//		//1st method
//		
//	char[] a=	s.toCharArray();
//	
////int len=	 a.length;
////
////for(int i=len-1;i>=0;i--)
////{
////	rev=rev+a[i]+"";
////}
////		System.out.println("Rev the string is:"+rev);
////	
//	
//	for(int i=a.length-1;i>=0;i--)
//	{
//		rev=rev+a[i]+"";
//	}
//		System.out.println(rev);
		
		//2nd method
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i)+"";
		}
		System.out.println(rev);
	}

}
