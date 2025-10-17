package task12_Interface;

	// Step 1: Define the interface
	public interface Payments01 {
	    void processPayment();
	}

	// Step 2: Implement CreditCardPayment class
	class CreditCardPayment implements Payments01 {
	    @Override
	    public void processPayment() {
	        System.out.println("Processing payment through Credit Card.");
	    }
	}

	// Step 3: Implement PaypalPayment class
	class PaypalPayment implements Payments01 {
	    @Override
	    public void processPayment() {
	        System.out.println("Processing payment through PayPal.");
	    }
	

	// Step 4: Test the implementation
	
	    public static void main(String[] args) {
	        Payments01 creditCard = new CreditCardPayment();
	        Payments01 paypal = new PaypalPayment();

	        creditCard.processPayment();  // Output: Processing payment through Credit Card.
	        paypal.processPayment();      // Output: Processing payment through PayPal.
	    }
	}
