package Task6Operators.TerinaryOperator;

public class MinimumOfThreeNumber {
    public static void main(String[] args) {
        double a=13.6,b=5.8,c=21.3;
        double mininum=((a<b)?((a<c)?a:c):((b<c)?b:c));
        System.out.println(mininum+" is minimum number");
    }
}
