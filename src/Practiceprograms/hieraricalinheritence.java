package Practiceprograms;

class Student
{
	void mark()
	{
		System.out.println("mark is 90");
	}
}
class Employee extends Student
{
	void salary()
	{
		System.out.println("salary is 50k");
	}
}
class Bike extends Student
{
	void speed()
	{
		System.out.println("50kmts/ph");
	}
}
public class hieraricalinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bike b=new Bike();
		b.speed();
		b.mark();
	}

}
