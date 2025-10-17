package Bankacc;

public class BalGet extends BankAcc {
    String ac1= this.getAccNum();
    int balNew= this.getBal();
    public static void main() {
        System.out.println("Account Balance: "+getBal());
        System.out.println("Enter the Account Number: ");
        BankAcc.main();

    }
}
