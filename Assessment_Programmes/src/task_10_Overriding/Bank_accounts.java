package task_10_Overriding;

//Parent class
class BankAccount {
 double balance;

 BankAccount(double balance) {
     this.balance = balance;
 }

 // Method to calculate interest; default implementation returns 0
 double calculateInterest() {
     return 0;
 }

 void displayInterest() {
     System.out.println("Interest: " + calculateInterest());
 }
}

//Subclass for Savings Account
class SavingsAccount extends BankAccount {
 double interestRate = 0.04;  // 4% annual interest

 SavingsAccount(double balance) {
     super(balance);
 }

 @Override
 double calculateInterest() {
     return balance * interestRate;
 }
}

//Subclass for Current Account
class CurrentAccount extends BankAccount {
 double interestRate = 0.01;  // 1% annual interest

 CurrentAccount(double balance) {
     super(balance);
 }

 @Override
 double calculateInterest() {
     return balance * interestRate;
 }
}

