package Banking;
import java.util.Scanner;
import static java.lang.System.out;
public class Account 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		out.println("Enter Account No: ");
		long Accno = sc.nextLong();
		out.println("Enter Account type: ");
		String Acctype = sc.next();
		out.println("Enter Balance: ");
		float Bal = sc.nextFloat();
		out.println("Enter Username: ");
		String username = sc.next();
		out.println("Enter IFSC Code: ");
		String Ifsc = sc.next();
		out.println("Account no :" +Accno);
		out.println("Account type :" +Acctype);
		out.println("Balance:" +Bal);
		out.println("Username :" +username);
		out.println("Ifsc:" +Ifsc);
	}
}
