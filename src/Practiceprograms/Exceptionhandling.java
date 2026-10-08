package Practiceprograms;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the num");
		
	try {
		int num=scanner.nextInt();
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
	finally {
		System.out.println("It is always be executed");
	}
	
//	File f= new File("abc.txt");
//		
//	try {
//		FileInputStream fileInputStream= new FileInputStream(f);
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//	System.out.println(e);
//	}
//	
	
		//artithmetic exception
//		int a=5;
//		
//		int b=0;
//		
//		try
//		{
//			int c=a/b;
//		}
//		catch (Exception e) {
//			
//			System.out.println(e);
//		}
	}

}
