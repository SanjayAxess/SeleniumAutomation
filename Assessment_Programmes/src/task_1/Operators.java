package task_1;

public class Operators {

	public static void main(String[] args) {
		
		        // 1. Arithmetic Operations
		        double num1 = 25, num2 = 5;
		        double add = num1 + num2;
		        double sub = num1 - num2;
		        double mul = num1 * num2;
		        double div = num1 / num2;

		        // 2. Modulus Operation
		        double mod = num1 % num2;

		        // 3. Increment/Decrement
		        double inc = ++num1;
		        double dec = --num1;

		        // 4. Circle Circumference
		        double radius = 7;
		        double circumference = 2 * Math.PI * radius;

		        // 5. Quadratic Equation Roots (ax² + bx + c = 0)
		        double a = 1, b = -3, c = 2;
		        double discriminant = b * b - 4 * a * c;
		        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
		        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

		        // 6. Average of Three Numbers
		        int n1 = 10, n2 = 20, n3 = 30;
		        double avg = (n1 + n2 + n3) / 3.0;

		        // 7. Convert Meters to Kilometers
		        double meters = 1500;
		        double km = meters / 1000;

		        // 8. Currency Converter (USD to INR)
		        double usd = 10;
		        double inr = usd * 84.0;

		        // 9. Tip Calculator
		        double bill = 1000;
		        double tipPercent = 10;
		        double tip = bill * tipPercent / 100;

		        // 10. Total Cost Calculation (including tax)
		        double price = 500;
		        double taxPercent = 18;
		        double totalCost = price + (price * taxPercent / 100);

		        // ---- SUMMARY OUTPUT ----
		        System.out.println("==== SUMMARY OF ALL OPERATIONS ====");
		        System.out.println("1. Addition = " + add);
		        System.out.println("   Subtraction = " + sub);
		        System.out.println("   Multiplication = " + mul);
		        System.out.println("   Division = " + div);
		        System.out.println("2. Modulus = " + mod);
		        System.out.println("3. Increment = " + inc + ", Decrement = " + dec);
		        System.out.println("4. Circle Circumference = " + circumference);
		        System.out.println("5. Roots of Quadratic Equation = " + root1 + " , " + root2);
		        System.out.println("6. Average of Three Numbers = " + avg);
		        System.out.println("7. Meters to Kilometers = " + km + " km");
		        System.out.println("8. Currency Conversion (USD to INR) = ₹" + inr);
		        System.out.println("9. Tip Amount = ₹" + tip);
		        System.out.println("10. Total Cost (with tax) = ₹" + totalCost);
		    }
	
}
