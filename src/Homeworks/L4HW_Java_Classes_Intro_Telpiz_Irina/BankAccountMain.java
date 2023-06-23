package Homeworks.L4HW_Java_Classes_Intro_Telpiz_Irina;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount();
        account1.accountNumber = 1111654999;
        BankAccount balance1 = new BankAccount();
        balance1.accountBalance = 1000;

        BankAccount account2 = new BankAccount();
        account2.accountNumber = 1222654777;
        BankAccount balance2 = new BankAccount();
        balance2.accountBalance = 500;

        BankAccount account3 = new BankAccount();
        account3.accountNumber = 1333654555;
        BankAccount balance3 = new BankAccount();
        balance3.accountBalance = 200;



        System.out.println("\n"+ account1.accountNumber);
        balance1.takeMoney(2000);

        System.out.println("\n"+ account1.accountNumber);
        balance1.takeMoney(100);

        System.out.println("\n" + account2.accountNumber);
        balance2.takeMoney(100);

        System.out.println("\n" + account3.accountNumber);
        balance3.addMoney(50);











    }
}
