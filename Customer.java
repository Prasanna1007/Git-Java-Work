package Banking;
import static java.lang.System.out;

import java.util.Scanner;

public class Customer 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter CustomerName: ");
		String custname = sc.next();
		out.println("Enter Customer Age: ");
		int age = sc.nextInt();
		out.println("Enter Customer address: ");
		String addr = sc.next();
		out.println("Enter Date Of Birth: ");
		String dob = sc.next();
		out.println("Enter Customer MobileNo: ");
		long mbno = sc.nextLong();
		out.println("Enter DestinationName: ");
		String destname = sc.next();
		out.println("Enter phoneNumber: ");
		String phno = sc.next();
		out.println("Enter Reason: ");
		String reason = sc.next();
		out.println("Enter status: ");
		String status = sc.next();
		out.println("Enter Departure Date: ");
		String departdate = sc.next();
		out.println("Customer Name : " +custname);
		out.println("Customer Age : " +age);
		out.println("Customer Address : " +addr);
		out.println("DOB(dd/mm/yyyy) : " +dob);
		out.println("Customer MobileNo: " +mbno);
		out.println("DestinationName : " +destname);
		out.println("Phonenumber : " +phno);
		out.println("Reason: " +reason);
		out.println("Status: " +status);
		out.println("DepartureDate: " +departdate);
	}

}
