package Banking;

import static java.lang.System.out;

import java.util.Scanner;

public class Branch {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	out.println("Enter BranchId: ");
	int branchid = sc.nextInt();
	out.println("BranchId :" +branchid);
	out.println("Enter LocationId: ");
	int locatid = sc.nextInt();
	out.println("LocationId :" +locatid);
	}

	}

