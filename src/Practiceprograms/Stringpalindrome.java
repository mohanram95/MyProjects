package Practiceprograms;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the string:");
		
	String str=	scanner.next();
	
	String orginal=str;
	
	String rev="";
	
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i)+"";
	}
	if(orginal.equals(rev))
	{
		System.out.println("It is palindrome string");
	}
	else
	{
		System.out.println("It is not palindrome string");
	}
	}

}
