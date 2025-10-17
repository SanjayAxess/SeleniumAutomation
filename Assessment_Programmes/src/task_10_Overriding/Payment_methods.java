package task_10_Overriding;

//Base class
class Payment_methods {
 public void makePayment(double amount) {
     System.out.println("Processing generic payment of $" + amount);
 }
}

//Subclass for credit card payments
class CreditCard extends Payment_methods {
 @Override
 public void makePayment(double amount) {
     System.out.println("Processing credit card payment of $" + amount);
     // Add credit card specific processing logic here
 }
}

//Subclass for debit card payments
class DebitCard extends Payment_methods {
 @Override
 public void makePayment(double amount) {
     System.out.println("Processing debit card payment of $" + amount);
     // Add debit card specific processing logic here
 }
}

//Subclass for PayPal payments
class PayPal extends Payment_methods {
 @Override
 public void makePayment(double amount) {
     System.out.println("Processing PayPal payment of $" + amount);
     // Add PayPal specific processing logic here
 }
}

