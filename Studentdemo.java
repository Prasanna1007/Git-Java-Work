package arith;

class Student 
{
	//method definition and all are non static members 
	public String name;
	public int rollno = 10;
	public void display() 
	{
		String title ="Prasanna";
		String name = "ABC";
		System.out.println(title);
		System.out.println(name);
		title = "Roll no : ";
		System.out.print(title);
		System.out.println(rollno);
	}
}
class Studentdemo
{
	
	public static void main(String[] args) //memory is allocated 
	{
		Student s = new Student();//method calling
		s.display();
	}
}
		

