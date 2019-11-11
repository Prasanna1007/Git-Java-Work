package Banking;
import static java.lang.System.out;

import java.util.Scanner;

public class Bank 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		out.println("Enter BankId: ");
		int id = sc.nextInt();
		out.println("Enter BankName: ");
		String name = sc.next();
		out.println("Enter IFSC Code: ");
		String ifsc = sc.next();
		out.println("BankID  :" +id);
		out.println("BankName :" +name);
		out.println("Ifsc:" +ifsc);
	}
}
