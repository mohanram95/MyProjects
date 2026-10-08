package Practiceprograms;

class Animal
{
	public void eat()
	{
		System.out.println("Animal can be eating");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Dog was barking outside");
	}
}

public class Singleinheritence

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Dog dog= new Dog();
		dog.bark();
		dog.eat();
		
		
		
	}

}
