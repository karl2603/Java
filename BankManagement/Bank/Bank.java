package BankManagement.Bank;

public class Bank {
    public final static String bankName = "Mesa Verde";
    private static int totalAccounts = 1247531;
    public static void getBankName(){
        System.out.println("--Bank Details--");
        System.out.println("Bank Name : "+bankName);
        System.out.println("Total Number Of Accounts : "+totalAccounts);
    }    
    protected void incrementTotalAccount(){
        this.totalAccounts += 1;
    }
}
