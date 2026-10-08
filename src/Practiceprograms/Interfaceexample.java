package Practiceprograms;

interface Fund
{
	void salary();
	
}

class Amount implements Fund
{
	public void salary()
	{
		System.out.println("The salary is:"+50000);
	}
}

public class Interfaceexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amount amount= new Amount();
	
		amount.salary();
		
	}

}
