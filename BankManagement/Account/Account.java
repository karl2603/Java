package BankManagement.Account;

import BankManagement.Bank.*;

public class Account extends Bank{
    protected String accountName;
    protected int accountNo;
    protected double accountBalance;

    Account(String accountName, int accountNo, double accountBalance){
        this.accountName = accountName;
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        incrementTotalAccount();
    }
    void deposit(double amount){
        accountBalance += amount;
    }
    void withdraw(double amount){
        accountBalance -= amount;
    }
    void checkBalance(){
        System.out.println("Balance : "+accountBalance);
    }
    void displayAccount(){
        System.out.println("Account Name : "+accountName);
        System.out.println("Account Number : "+accountNo);
        System.out.println("Account Balance : "+accountBalance);
    }
    public static void main(String[] args) {
        Account Account1 = new Account("Karl", 29, 2500L);
        Account Account2 = new Account("Vilas", 03, 1500L);
        Account Account3 = new Account("Vignesh", 27, 600L);
        Account Account4 = new Account("Rupa", 36, 2000L);
        Account Account5 = new Account("Roshan", 30, 200L);
        Account Account6 = new Account("Allwin", 3, 800L);
        getBankName();
        Account1.deposit(300);
        Account6.withdraw(100);
        Account1.displayAccount();
        Account6.displayAccount();
    }
}
