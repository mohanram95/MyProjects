package Practiceprograms;

import java.util.Scanner;

public class findthepositionofthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter the char");
		
	char given=	scanner.next().charAt(0);
	
given=	Character.toLowerCase(given);

int asciivalue=(int)given;

int position=asciivalue-96;

System.out.println(position);


		
	}

}
