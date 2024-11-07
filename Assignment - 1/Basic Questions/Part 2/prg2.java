/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 1

-----------------------------------------------------------------

Part 2: Classes and Methods

Program - 2 Write a BankAccount class with the 
following properties: accountNumber, balance, and owner. 
Implement methods to deposit, withdraw, and check the account balance.

------------------------------------------------------------------

*/

class BankAccount{
    
    private String accountNumber;
    private double balance;
    private String owner;

    BankAccount(){}

    BankAccount( String name, String acn, double bal ){
        accountNumber = acn;
        owner = name;
        if( bal < 0 ){
            balance = 0;
        }else{
            balance = bal;
        }
    }

    void showDetails(){
        System.out.println("Owner Is " + owner );
        System.out.println("Account Number Is " + accountNumber );
        if( balance < 0 ){
            balance = 2000;
        }
    }

    void checkBalance(){
        showDetails();
        System.out.println("Balance Is " + balance);
        System.out.println("\n");
    }

    void deposit( double money ){
        System.out.println( "After Depositing " + money + " In Balance " );
        balance += money;
        System.out.println();
        checkBalance();
    }

    void withdraw( double money ){
        System.out.println( "After Withdrawing " + money + " From Balance " );
        balance += money;
        System.out.println();
        checkBalance();
    }

}

class Program2{
    
    public static void main( String[] args ){
        
        System.out.println("\nDetails \n");

        BankAccount account = new BankAccount( "KRISH","190220058420",50000 );

        account.withdraw(100);
        account.deposit(7000);


    }


}

/*

-----------------------------------------

Output :

-----------------------------------------


Details

After Depositing 1000.0 In Balance

Owner Is KRISH
Account Number Is 190220058420
Balance Is 51000.0


After Withdrawing 11000.0 From Balance

Owner Is KRISH
Account Number Is 190220058420
Balance Is 62000.0


************************************


Details

After Withdrawing 100.0 From Balance

Owner Is RASHI
Account Number Is 200546768420
Balance Is 3100.0


After Depositing 7000.0 In Balance

Owner Is RASHI
Account Number Is 200546768420
Balance Is 10100.0



--------------------------------------------

*/