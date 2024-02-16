//import java.util.*;
class SavingsAccount extends Account {
    double interest_rate;
    void withdraw(double balance,double wd)
    {
        if(balance > wd)
        {
            balance=balance-wd;
            System.out.println("your money has been withdrawn successfully.");
            System.out.println("Your account has been debited with Rs."+wd);
            System.out.println("Your balance is Rs."+balance);

        }else
        {
            System.out.println("You have insufficient balance.");
        }
    }
    
}