//import java.util.*;
public class CurrentAccount extends Account {
    double overdraft_limit,wd,balance;
    void withdraw(double balance,double wd)
    {
        if(wd > overdraft_limit)
        {
            System.out.println("You have exceeded the overdraft limit.");
        }else
        {
            balance=balance-wd;
            System.out.println("Your withdrawl is allowed.");
        }
    }
    
}