package Task11Interface.PaymentInterface;

public interface Payment {
    void processPayment();
}
class CreditcardPayment implements Payment{

   // @Override
    public void processPayment() {
        System.out.println("Credit Card Payment is Sucessfull");
    }
}
class PaypalPayment extends CreditcardPayment implements Payment{

    //@Override
    public void processPayment() {
        //super.processPayment();
        System.out.println("PayPal Payemnt is Done");
    }

    public static void main(String[] args) {
        PaypalPayment pay=new PaypalPayment();
        pay.processPayment();

        CreditcardPayment pay1=new CreditcardPayment();
        pay1.processPayment();

        //2nd method to print both
//        Payment payment=new CreditcardPayment();
//        payment.processPayment();
//        Payment payment1=new PaypalPayment();
//        payment1.processPayment();
    }
}
