package Practiceprograms;

import java.util.Scanner;

public class findthelargestnumof3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter the first num:");
		
		int a=scanner.nextInt();
		
Scanner scanner1= new Scanner(System.in);
		
		System.out.println("enter the second num:");
		
		int b=scanner1.nextInt();
		
Scanner scanner2= new Scanner(System.in);
		
		System.out.println("enter the third num:");
		
		int c=scanner2.nextInt();
		
		if(a>b&&a>c)
		{
			System.out.println("a is largest number");
		}
		 else if(b>a&&b>c)
		 {
			 System.out.println("b is largest number");
		 }
		 else
		 {
			 System.out.println("c is largest number");
		 }
		
	}

}
