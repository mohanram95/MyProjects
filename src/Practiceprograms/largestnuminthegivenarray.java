package Practiceprograms;

public class largestnuminthegivenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {7,8,9,3,6};
		
		int largest=num[0];
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>largest)
			{
				largest=num[i];
			}
		}
		System.out.println("The largest num is:"+largest);
	}

}
