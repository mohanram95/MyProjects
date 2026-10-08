package Practiceprograms;

public class Methodoverloading 
{
	public void display()
	{
		System.out.println("sunday");
	}
    public void display(int a)
    {
    	System.out.println("Monday");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodoverloading m= new Methodoverloading();
		
		m.display(8);
		
	}

}
