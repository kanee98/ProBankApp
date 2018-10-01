# ProBankApp
An application created for ProBank to facilitate simple transactions using Java programming language.

The application performs the following tasks 
 * Display a welcome message “Welcome to my ProBankApp”  
 * Display an account name and opening balance of Rs.1000s.   
 * Prompt the user to choose among the following options 
            1 – Deposits 
            2 – Withdrawals 
            0 – Exit  
 * If the user enters any other number other than the given valid options, the application prompts an error message and continue to          request   the user to enter a valid option.  
 * If the user enters option 0, the application displays “Thank you for using ProBankApp, hope to see you soon!!!!” and terminate.   
 * If the user enters option 1, the application obtains the number of currency notes deposited, calculate and display the amount              deposited.   Further the amount deposited should be added to the balance (opening balance).  
   E.g.  Enter the number of currency notes deposited 
            Rs.5000 |– 1 
            Rs.2000 |– 1 
            Rs.1000 |– 3 
            Rs.500 |– 0 
            Rs.100 |– 4 
            Rs.50  |– 2 
            Rs.20  |– 0 
            Rs.10  |– 3 
            Amount deposited  |– Rs.10530 
            Balance   |– Rs.11530 (since the opening balance was Rs.1000)  
 * If the user enters option 2, the application obtains the amount to be withdrawn and check against the balance to verify whether there      is sufficient funds available to perform the withdrawal. 
 * Further, the application displays the breakdown and the number of currency notes. 
   E.g.  Enter the amount of withdrawal |-8500  
            Rs.5000 |– 1 
            Rs.2000 |– 1 
            Rs.1000 |– 1 
            Rs.500 |– 1 
            Rs.100 |– 0 
            Rs.50  |– 0 
            Rs.20  |– 0 
            Rs.10  |– 0 
            Balance   |– Rs.3030 (if the balance was Rs.11530) 
