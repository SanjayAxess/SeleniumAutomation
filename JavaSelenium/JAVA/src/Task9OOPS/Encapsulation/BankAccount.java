package Task9OOPS.Encapsulation;

public class BankAccount {
   private int AccountNumber;
    private double Balance;

    //This is Constructer
    public BankAccount(int AccountNumber,double Balance){
        this.AccountNumber=AccountNumber;
        this.Balance=Balance;
    }

    //Calling set and get nethod for private variables
    public void setAccountNumber(int AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void deposite(double amount){
        if(amount>0){
            Balance+=amount;
            System.out.println("Deposited amount Rs."+amount);
        }else{
            System.out.println("Invalid Deposit amount");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=Balance){
            Balance-=amount;
            System.out.println("Withdrawn Amount is Rs."+amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public void displayAccountInfo(){
        System.out.println("Account Number :"+AccountNumber);
        System.out.println("Current Balance : Rs"+Balance);
    }


}
