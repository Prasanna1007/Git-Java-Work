package Banking;

import static java.lang.System.out;

import java.util.Scanner;

public class RecurringAccount 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter Account No: ");
		long recurraccno = sc.nextLong();
		out.println("Account no :" +recurraccno);
	}
}

