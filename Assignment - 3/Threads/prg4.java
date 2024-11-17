/*

NAME - SHAH KRISH J.
ROLL NO. - 47
SEM - V
SUBJECT - JAVA PROGRAMMING
COURSE - COMPUTER SCIENCE
ASSIGNMENT - 3

-----------------------------------------------------------------

Program - 4 :  Create a class ‘Account’ with private data like 
accountnumber, name, balance and method  transaction() which handles 
withdraws and deposits with suitable display messages.  

∙ Create a thread class ‘Teller’ with private data like name, an object of 
class Account,  amount of transaction and transaction code (deposit or withdrawal).  

∙ Initiate 2 teller transactions for customer A.  

∙ Also initiate two separate transaction for customer B and customer C.  

∙ Transactions for one customer must run in synchronization.  

∙ Transactions for different customers do not interfere with one another.

------------------------------------------------------------------

*/

class Account {
    private final int accountNumber;
    private final String name;
    private double balance;

    public Account(int accountNumber, String name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = initialBalance;
    }

    public synchronized void transaction(String transactionType, double amount) {
        if (transactionType.equalsIgnoreCase("deposit")) {
            balance += amount;
            System.out.println(name + " deposited " + amount + ". New balance: " + balance);
        } else if (transactionType.equalsIgnoreCase("withdrawal")) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(name + " withdrew " + amount + ". New balance: " + balance);
            } else {
                System.out.println(name + " attempted to withdraw " + amount + ". Insufficient balance.");
            }
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

class Teller extends Thread {
    private final String tellerName;
    private final Account account;
    private final double amount;
    private final String transactionType;

    public Teller(String tellerName, Account account, double amount, String transactionType) {
        this.tellerName = tellerName;
        this.account = account;
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public void run() {
        synchronized (account) {
            System.out.println(tellerName + " started transaction: " + transactionType + " of " + amount);
            account.transaction(transactionType, amount);
            System.out.println(tellerName + " completed transaction.");
        }
    }
}

class Program4{

    public static void main( String[] args ){
    
        Account accountA = new Account(101, "Rajesh", 5000);
        Account accountB = new Account(102, "Mahesh", 3000);
        Account accountC = new Account(103, "Suresh", 4000);

        Teller teller1A = new Teller("Chinu", accountA, 1000, "deposit");
        Teller teller2A = new Teller("Shinu", accountA, 2000, "withdrawal");

        Teller teller1B = new Teller("Shyam", accountB, 500, "deposit");
        Teller teller2B = new Teller("Ram", accountB, 1500, "withdrawal");

        Teller teller1C = new Teller("Babu", accountC, 1000, "deposit");
        Teller teller2C = new Teller("Kalu", accountC, 500, "withdrawal");

        teller1A.start();
        teller2A.start();

        teller1B.start();
        teller2B.start();

        teller1C.start();
        teller2C.start();

    }

}

/*

-----------------------------------------

Output :

-----------------------------------------

PS C:\Users\KRISH\KRISH\SEM - V\Java\Java_Assisgnment\Assignment - 3\Threads> javac prg4.java
PS C:\Users\KRISH\KRISH\SEM - V\Java\Java_Assisgnment\Assignment - 3\Threads> java Program4  
Chinu started transaction: deposit of 1000.0
Babu started transaction: deposit of 1000.0
Shyam started transaction: deposit of 500.0
Mahesh deposited 500.0. New balance: 3500.0
Rajesh deposited 1000.0. New balance: 6000.0
Suresh deposited 1000.0. New balance: 5000.0
Shyam completed transaction.
Chinu completed transaction.
Babu completed transaction.
Ram started transaction: withdrawal of 1500.0
Shinu started transaction: withdrawal of 2000.0
Kalu started transaction: withdrawal of 500.0
Mahesh withdrew 1500.0. New balance: 2000.0
Ram completed transaction.
Rajesh withdrew 2000.0. New balance: 4000.0
Suresh withdrew 500.0. New balance: 4500.0
Kalu completed transaction.
Shinu completed transaction.

--------------------------------------------

*/