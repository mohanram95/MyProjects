package Practiceprograms;

import java.util.Scanner;

public class Numberispalindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter the num");
		
	int num=	scanner.nextInt();
	
	int original=num;
	
	int rev=0;
	
	while(num!=0)
	{
		rev=rev*10;
		rev=rev+num%10;
		num=num/10;
	}
	if(original==rev)
	{
		System.out.println("It is a palindrome");
	}
	else
	{
		System.out.println("It is not a palindrome");
	}
	
	
	}

}
