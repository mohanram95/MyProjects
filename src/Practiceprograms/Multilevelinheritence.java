package Practiceprograms;


class Cat
{
	void run()
	{
		System.out.println("runing");
	}
}
class Tiger extends Cat
{
	void eat()
	{
		System.out.println("eating");
	}
}
class C extends Tiger
{
	void sleep()
	{
		System.out.println("Sleeping");
	}
}
public class Multilevelinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c= new C();
		
		c.sleep();
		c.eat();
		c.run();
		
	}

}
