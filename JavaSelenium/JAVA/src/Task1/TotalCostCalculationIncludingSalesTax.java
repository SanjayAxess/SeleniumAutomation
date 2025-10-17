package Task1;

import java.util.Scanner;

public class TotalCostCalculationIncludingSalesTax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double product_cost;
        System.out.println("Enter the Product cost:");
        product_cost=scanner.nextDouble();
        double sales_tax;
        System.out.println("Enter the sales tax in percentage:");
        sales_tax=scanner.nextDouble();
        double total_cost=product_cost+(product_cost*sales_tax/100);
        System.out.println("The total cost is :\u20B9"+total_cost);
    }
}
