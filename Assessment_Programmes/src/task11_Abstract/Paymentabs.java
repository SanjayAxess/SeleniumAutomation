package task11_Abstract;

//Abstract class
abstract class Payment {
 // Abstract method
 abstract void makePayment();
}

//Subclass 1: BankTransfer
class BankTransfer extends Payment {
 @Override
 void makePayment() {
     System.out.println("Payment made through Bank Transfer.");
 }
}

//Subclass 2: MobilePayment
class MobilePayment extends Payment {
 @Override
 void makePayment() {
     System.out.println("Payment made through Mobile Payment.");
 }
}

//Main class to test
public class Paymentabs {
 public static void main(String[] args) {
     // Create objects of both subclasses
     Payment bank = new BankTransfer();
     Payment mobile = new MobilePayment();

     // Call makePayment() methods
     bank.makePayment();
     mobile.makePayment();
 }
}

