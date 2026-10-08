package Practiceprograms;

public class Countthenoofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=74289729;
		
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
System.out.println("Total no of digits is:"+count);
	}

}
