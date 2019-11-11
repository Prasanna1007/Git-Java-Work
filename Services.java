package Banking;

import static java.lang.System.out;

import java.util.Scanner;

public class Services {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		out.println("Enter Account No: ");
		long Accno = sc.nextLong();
		out.println("Enter CIBIL Score: ");
		float cibil = sc.nextFloat();
		out.println("Enter Period: ");
		float period = sc.nextFloat();
		out.println("Enter RateOfInterest: ");
		float rate = sc.nextFloat();
		out.println("Account NO :" +Accno);
		out.println("CIBIL Score :" +cibil);
		out.println("Period :" +period);
		out.println("Rate Of Interest: " +rate);
	}
}
