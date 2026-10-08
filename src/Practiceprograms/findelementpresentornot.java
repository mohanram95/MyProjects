package Practiceprograms;

public class findelementpresentornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {8,1,4,2,9};
		
		int numtofind=7;
		 
		Boolean found=false;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==numtofind)
			{
				found=true;
			}
		}
		if(found)
		{
			System.out.println("element is present");
		}
		else
		{
			System.out.println("element is not present");
		}
	}

}
