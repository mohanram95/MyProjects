package Practiceprograms;

abstract class Student1
{
	abstract void mark();
}

class Exam extends Student1
{
	void mark()
	{
		System.out.println("Your mark is 100");
	}
}
public class abstarctionexample
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam exam= new Exam();
		
		exam.mark();

	}

}
