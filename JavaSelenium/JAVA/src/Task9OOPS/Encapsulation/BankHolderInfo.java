package Task9OOPS.Encapsulation;

public class BankHolderInfo {
    public static void main(String[] args) {
        //BankAccount account=new BankAccount();


        //account.setAccountNumber(2018754946);
//        System.out.println(account.getAccountNumber());


//        account.setBalance(15000.00);
//        System.out.println(account.getAccountNumber());


//        account.deposite(20000.00);
//        account.withdraw(5500);
//        account.displayAccountInfo();


        //constructer
        BankAccount account=new BankAccount(2018754196,20000.00);
        account.deposite(10000);
        account.withdraw(5500.00);
        account.displayAccountInfo();

    }
}
