package interest_calculator;
import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("choose from following:\n1. Interest Calculator --SB\n2. Interest Calculator --FD\n3. Interest Calculator --RD\n4. Exit");
		int option = sc.nextInt();
		try {
		switch(option)
		{
		case 1: getSBInterest();break;
		case 2: getFDInterest();break; 
		case 3: getRDInterest();break;
		case 4: System.exit(0); break;
		default : System.out.println("invalid option");
		}
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
		}
	}

	private static void getRDInterest() throws Exception
	{
		System.out.println("enter RD amount:");
		double amount= sc.nextDouble();
		
		System.out.println("enter no.of days:");
		int days = sc.nextInt();
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		RDAccount r =new RDAccount(amount, age, days);
		
		System.out.println("Interest gained is "+r.calculateInterest());
		
	}

	private static void getFDInterest() throws Exception {
		System.out.println("enter FD amount:");
		double amount= sc.nextDouble();
		
		System.out.println("enter no.of days:");
		int days = sc.nextInt();
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		
		FDAccount f =new FDAccount(amount, days, age);
		
		System.out.println("Interest gained is "+f.calculateInterest());
	}

	private static void getSBInterest() throws Exception
	{
		System.out.println("enter SB amount:");
		double amount= sc.nextDouble();
		
		boolean isNormalAcc = false;
		System.out.println("type Y if Normal account : ");
		String s = sc.next();
		if(s.equals("Y")|| s.equals("y"))
			isNormalAcc = true;
			
		
		SBAccount sb = new SBAccount(amount, isNormalAcc);
		
		System.out.println("Interest gained is "+sb.calculateInterest());
	}

}
