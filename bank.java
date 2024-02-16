import java.util.*;
public class bank {
    static String abc=""; 
    public static void main(String args[])
    {
        SavingsAccount s1 = new SavingsAccount();
        //CurrentAccount c1 = new CurrentAccount();
        Scanner sc =new Scanner(System.in);
        s1.name = "bhumi";
        s1.balance = 10000;
        System.out.println("Enter 'deposit' to deposit and 'withdraw' to withdraw the money");
        abc = sc.nextLine();
        if(abc.equals("deposit"))
        {
            System.out.println("Enter money to deposit");
            s1.deposit = sc.nextDouble();
            System.out.println("Enter name of account holder");
            s1.name = sc.next();
            System.out.println("Enter account no.");
            s1.acc_no = sc.nextInt();
            s1.balance=s1.balance+s1.deposit;
            System.out.println("Your account has been credited with Rs."+s1.deposit);
            System.out.println("Your balance is Rs."+s1.balance);
        }
        else if(abc.equals("withdraw"))
        {
            System.out.println("Enter money to withdraw");
            s1.wd = sc.nextDouble();
            System.out.println("Enter name of account holder");
            s1.name = sc.next();
            System.out.println("Enter account no.");
            s1.acc_no = sc.nextInt();
            s1.withdraw(s1.balance,s1.wd);
            
            sc.close();
        }
    }
	 public void transfer(int sourceAccountNumber, int targetAccountNumber, double amount) {
        Account sourceAccount = getAccountByNumber(sourceAccountNumber);
        Account targetAccount = getAccountByNumber(targetAccountNumber);

        if (sourceAccount.getBalance() >= amount) {
            sourceAccount.withdraw(amount);
            targetAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from account " + sourceAccountNumber + " to account " + targetAccountNumber);
        } else {
            System.out.println("Insufficient balance in account " + sourceAccountNumber + " for transfer");
        }
    }

    public void generateStatement(int accountNumber) {
        Account account = getAccountByNumber(accountNumber);
        System.out.println("Statement for Account Number: " + accountNumber);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Transaction History:");
        
    }
}