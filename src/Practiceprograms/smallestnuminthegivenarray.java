package Practiceprograms;

public class smallestnuminthegivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {9,7,1,4,5};
		
		int smallest=num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		
		System.out.println("The smallest num is:"+smallest);
	}

}
