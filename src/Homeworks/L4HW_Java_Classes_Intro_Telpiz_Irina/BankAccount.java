package Homeworks.L4HW_Java_Classes_Intro_Telpiz_Irina;

public class BankAccount {

    long accountNumber;
    long accountBalance;

    public long takeMoney(long amount){
        System.out.println("Your balance was: " + accountBalance);
        if (accountBalance <= 0 ^ accountBalance < amount){
            System.out.println("Sorry you don't have enough money to complete operation");
        } else
        accountBalance -= amount;
        System.out.println("Your balance now is: " + accountBalance);
        return accountBalance;
    }

    public long addMoney(long amount){
        System.out.println("Your balance was: " + accountBalance);
        accountBalance += amount;
        System.out.println("Your balance now is: " + accountBalance);
        return accountBalance;
    }

}
