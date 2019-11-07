package myio;
import java.util.Scanner;

public class Acceptemp 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int eid = sc.nextInt();
		int esalary = sc.nextInt();
		String ename = sc.next();
		System.out.println( "Employee id = " + eid);
		System.out.println( "Employee Name = " + ename);
		System.out.println( "Employee Salary= " + esalary);
		
	}

}
