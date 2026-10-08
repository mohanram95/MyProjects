package Practiceprograms;

public class countnoofevenandoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=17352864;
		
		int even_num=0;
		int odd_num=0;
		
		while(num>0)
		{
			if(num%2==0)
			{
				even_num++;
			}
			else
			{
				odd_num++;
			}
			
			num=num/10;
		}
		
		System.out.println("Even count is:"+even_num);
		System.out.println("odd count is:"+odd_num);
	}

}
