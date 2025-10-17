package Bankacc;

import java.util.Scanner;

public class BankAcc {
    public static String getAccNum() {
        return accNum;
    }



    private static String accNum;

    public static int getBal() {
        return bal;
    }
    public static void setBal(int bal) {
        BankAcc.bal = bal;
    }
    private static int bal;
    public static int cb;
    public static int bal1;
    public static int eamount;
    private static Scanner scanner = new Scanner(System.in);
    public static void depMoney(){
        System.out.println("Enter the amount to Deposit: ");
        bal1 = scanner.nextInt();
        if (bal1 <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
        } else {
            bal += bal1;
            System.out.println("Balance after deposit: " + bal);
        }

    }
    public static void withDrawMoney() {
        System.out.println("Enter the amount to Withdraw: ");
        eamount = scanner.nextInt();
        if (eamount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
        } else if (eamount > bal) {
            System.out.println("Insufficient balance!");
        } else {
            bal -= eamount;
            System.out.println("Amount withdrawn: " + eamount);
        }
    }
    public static void menuItem(){

            System.out.println("Choose an option:\n"
                    + "1. Deposit\n"
                    + "2. Withdraw\n"
                    + "3. Check Balance\n"
                    + "0. Exit"   );
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    depMoney();
                    chooseBack();
                    break;
                case 2:
                    withDrawMoney();
                    chooseBack();
                    break;
                case 3:
                    System.out.println("Current Balance: " + bal);
                    chooseBack();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Entered a invaild input");
                    chooseBack();
                    break;

            }


    }
    public static void chooseBack(){
        System.out.println("Return to choice screen enter 1 \n"
                +"To logout enter 2 \n"
                +"To exit enter 0\n");
        cb = scanner.nextInt();
        if (cb == 1) {
            BankAcc.menuItem();
        } else if (cb == 2) {
            BalGet.main();
        } else if (cb == 0) {
            System.out.println("Exiting...");
            return;
        } else {
            System.out.println("Invalid input!");
            BankAcc.chooseBack();
        }
    }

   public static void main() {

        accNum ="thE333";
       Scanner scanner = new Scanner(System.in);

       String accNum1 = scanner.nextLine();
       if(accNum1.equals(accNum)){
        menuItem();
        }else {
            System.out.println("Invaild Account number");
            BalGet.main();
        }
    }
}
