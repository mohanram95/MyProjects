package Practiceprograms;

public class swaptwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//withoutthirdvaribale
//		  int first=50;
//		  
//		  int second=40;
//		  
//		  System.out.println("before swapping"+"first num is:"+ first+"second num is:"+ second);
//		  
//		  first=first-second;
//		  second=first+second;
//		  first=second-first;
//		  
//		  System.out.println("after swapping"+"first num is:"+first+"second num is:"+ second);
		
		//withthirdvariable
		
		int mysalary=50000;
		int myfriendsalary=40000;
		
		
		System.out.println("before swapping"+"mysalary is:"+mysalary+"myfriendsalary is:"+myfriendsalary);
		
		 int temp=mysalary;
		 mysalary=myfriendsalary;
		 myfriendsalary=temp;
		
		System.out.println("after swapping"+"mysalary is:"+mysalary+"myfriend salary is:"+myfriendsalary);
//		  
	}

}
