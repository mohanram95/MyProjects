package Practiceprograms;


class Human
{

	private int age=30;
	
	public int getage()
	{
		return age;
	}
	
	public void setage(int a)
	{
		System.out.println("The age is changed to:"+a);
		age=a;
	}
}
public class Encapsulation
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h= new Human();
		h.setage(50);
		System.out.println(h.getage());
	}

}
