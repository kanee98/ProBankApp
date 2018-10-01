import java.util.Scanner;

/**
 * Created by KanishkaUdapitiya on 1/5/2016.
 */
 
public class Bank
{
	public static void main(String[] args)
	{
		String name;
		int choice;
		
		// Importing the Heading from the 'heading' class
		heading s = new heading(); 
		
		// importing the 'Scanner Keyboard' to user to input
		Scanner input = new Scanner(System.in);
		
		// Welcome message
		System.out.println("\n * * * * * Welcome to My ProBankApp * * * * * ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
		
		// Asking to enter the Account Name
		System.out.print("\nEnter Account Name: ");
		name = input.next();
		
		// Importing 'BankAccount' class
		BankAccount acc = new BankAccount(name);
		
		// Importing the User Name and the Balance from the 'BankAccount' class and printing them
		System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Account Name 	: "+acc.getName());
		System.out.println("Balance 	: "+acc.getBalance());
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
		
		do
		{
			// Asking from the user to enter the choice to continue
			System.out.println("\nPlease enter your choice to continue!");
			System.out.print("\n\t1-Deposit\n\t2-Withdraw\n\t0-Exit\n\nChoice: ");
			choice = input.nextInt();
			// If the choice = 1, Deposit menu will prompt
			if(choice==1)
				acc.deposit();
			// If the choice = 2, Withdraw menu will prompt
			else if (choice==2) 
				acc.withdraw();
			// If the choice is not 0, 1 and 2, an error message will prompt
			else if(choice!=0 && choice!=1 && choice!=2) 
				System.out.println("Invalid choice! Please Try Again...! \n\n");
		} 
		
		// If the choice = 0, the application will exit appearing a Welcome message
		while(choice!=0);
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("\tThank you for using ProBankApp, \n\thope to see you soon!!!!"); 
		// Displaying  the heading
		s.h();
		System.exit(0);
	}
}
