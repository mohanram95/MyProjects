package Practiceprograms;

public class Printtheevenandoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {6,2,3,7,1,8};
		
		System.out.println("The even num is:");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("The odd num is:");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
