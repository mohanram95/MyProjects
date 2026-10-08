package Practiceprograms;

class A
{
	public void show()
	{
		System.out.println("welcome");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("hello");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b= new B();
		b.show();
	}

}
