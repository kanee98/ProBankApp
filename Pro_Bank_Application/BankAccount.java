/**
 * Created by KanishkaUdapitiya on 1/5/2016.
 */
 
import java.util.Scanner;

public class BankAccount
{
	private final String accountName;
	private int returnAmount, amount;
	private int balance;
	private int fivethousand, twothousand, thousand, fivehundred, hundred, fifty, twenty, ten;

	// importing the 'Scanner Keyboard' to user to input
	Scanner input = new Scanner(System.in);

	public BankAccount(String name)
	{
		// Account Name
		accountName = name;
		
		// Declaring the Fixed Balance = Rs.1000
		balance = 1000;
		
		// Declaring values for the variables
		fivethousand=0; twothousand=0; thousand=0; fivehundred=0; hundred=0; fifty=0; twenty=0; ten=0;
		amount=0;
	}

	// Taking the fixed balance
	public int getBalance()
	{
		return balance;
	}

	// Taking the Account Name
	public String getName()
	{
		return accountName;
	}

	//  Deposit Class
	public void deposit()
	{
		System.out.println("\nPlease Enter The Depositing Amount! ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
		
		// Letting user to input the no.of Rs. 5000 notes
		System.out.print("\nRs.5000	: ");
		fivethousand = input.nextInt();
		// Calculating the no.of Rs. 5000 notes
		amount += fivethousand*5000;
		
		// Letting user to input the no.of Rs. 2000 notes
		System.out.print("Rs.2000	: ");
		twothousand = input.nextInt();
		// Calculating the amount of Rs. 2000 notes
		amount += twothousand*2000;
		
		// Letting user to input the no.of Rs. 1000 notes
		System.out.print("Rs.1000	: ");
		thousand = input.nextInt();
		// Calculating the amount of Rs. 1000 notes
		amount += thousand*1000;
		
		// Letting user to input the no.of Rs. 500 notes
		System.out.print("Rs.500	: ");
		fivehundred = input.nextInt();
		// Calculating the amount of Rs. 500 notes
		amount += fivehundred*500;
		
		// Letting user to input the no.of Rs. 100 notes
		System.out.print("Rs.100	: ");
		hundred = input.nextInt();
		// Calculating the amount of Rs. 100 notes
		amount += hundred*100;
		
		// Letting user to input the no.of Rs. 50 notes
		System.out.print("Rs.50	: ");
		fifty = input.nextInt();
		// Calculating the amount of Rs. 50 notes
		amount += fifty*50;
		
		// Letting user to input the no.of Rs. 20 notes
		System.out.print("Rs.20	: ");
		twenty = input.nextInt();
		// Calculating the amount of Rs. 20 notes
		amount += twenty*20;
		
		// Letting user to input the no.of Rs. 10 notes
		System.out.print("Rs.10	: ");
		ten = input.nextInt();
		// Calculating the amount of Rs. 10 notes
		amount += ten*10;
		
		// Adding the Fixed Balance to the Amount
		balance += amount;
		
		// Displaying the Amount
		System.out.print("\n\nAmount	: Rs. "+amount);
		// Displaying the Total Amount with the Fixed Balance
		System.out.println("\nBalance	: Rs. "+ balance+"\n");
		// Displaying a configuration message
		// Displaying a configuration message
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Amount deposited successfully!\n");
	}

	// Withdraw Class
	public void withdraw()
	{
		// Letting user to input the Withdrawal Amount
		System.out.print("\nPlease Enter Withdrawal Amount	: Rs.  ");
		amount = input.nextInt();
		System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - ");
		
		
		// Declaring whether the Balance is greater than the Amount to be withdrawn
		// If Balance is greater than the Amount to be withdrawn, this statement will execute
		if(balance>amount)
		{
			// Taking the Return Amount
			returnAmount = amount;
			
			// Calculating the no.of Rs. 5000 notes
			fivethousand = amount/5000;
			amount %= 5000;
			
			// Calculating the no.of Rs. 2000 notes
			twothousand = amount/2000;
			amount %= 2000;
			
			// Calculating the no.of Rs. 1000 notes
			thousand = amount/1000;
			amount %= 1000;
			
			// Calculating the no.of Rs. 500 notes
			fivehundred = amount/500;
			amount %= 500;
			
			// Calculating the no.of Rs. 100 notes
			hundred = amount/100;
			amount %= 100;
			
			// Calculating the no.of Rs. 50 notes
			fifty = amount/50;
			amount %= 50;
			
			// Calculating the no.of Rs. 20 notes
			twenty = amount/20;
			amount %= 20;
			
			// Calculating the no.of Rs. 10 notes
			ten = amount/10;
			amount %= 10;
			
			balance -= returnAmount;
			
			// Displaying the results
			System.out.println("\n\nRs.5000	: "+ fivethousand);
			System.out.println("Rs.2000	: "+ twothousand);
			System.out.println("Rs.1000	: "+ thousand);
			System.out.println("Rs.500	: "+ fivehundred);
			System.out.println("Rs.100	: "+ hundred);
			System.out.println("Rs.50	: "+ fifty);
			System.out.println("Rs.20	: "+twenty);
			System.out.println("Rs.10	: "+ ten);
			// Displaying the Balance
			System.out.println("\nBalance	: Rs. "+ balance+"\n");
			// Displaying a configuration message
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
			System.out.println("Amount withdrew successfully!\n");
		}
		
		// If Balance is smaller than the Amount to be withdrawn, this statement will execute and an error message will prompt
		else
		{
			System.out.println("\n\nSorry, Insufficient Funds to proceed!");
		}
	}
}