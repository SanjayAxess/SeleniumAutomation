public class Chain extends Lend {

    private double bal;
    public Chain(){
        this(10000.00,"withdraw");
        System.out.println("Balance "+bal);
    }
    public Chain(double cash){
        super(27393);
        System.out.println("Bank Deposit");
        if(cash >=0){
            bal += cash;
            System.out.println("Balance : "+ bal);
        }else{
            System.out.println("Invalid amount");
        }

    }

    public Chain(double cash,String draw){
        this(15000.00);
        System.out.println("Bank Withdraw");
        if(bal >= cash){
            bal -= cash;
            System.out.println("Balance : "+ bal);
        }

    }

    static void main() {
        Chain c = new Chain();

    }
}
