package task_2;

public class Logical_operator {

	public static void main(String[] args) {
		int a = 10, b = 20;
        boolean x = true, y = false;

        // 1. Logical AND (&&)
        if (a < b && x == true) {
            System.out.println("Both conditions are true (Logical AND)");
        } else {
            System.out.println("At least one condition is false (Logical AND)");
        }

        // 2. Logical OR (||)
        if (a > b || y == false) {
            System.out.println("At least one condition is true (Logical OR)");
        } else {
            System.out.println("Both conditions are false (Logical OR)");
        }

        // 3. Logical NOT (!)
        System.out.println("Value of x: " + x);
        System.out.println("Inverted value of x (!x): " + !x);

	}

}
