package Practiceprograms;

import java.util.Iterator;
import java.util.Scanner;

public class printthetriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter the num");
		
	int num=	scanner.nextInt();
		
		int row;
		int column;
		
		for(row=0;row<num;row++)
		{
			for(column=0;column<=row;column++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println("The num is:"+ num);
	}

}
