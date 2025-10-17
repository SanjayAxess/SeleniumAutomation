package task_2;

public class Ternary_Operator {

	public static void main(String[] args) {
		
		        int a = 15, b = 8, c = 20;
		        int num = 11;
		        int score = 85;
		        int number = -7;
		        int absNum = -25;
		        int year = 2024;

		        // 1. Minimum of Three Numbers
		        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		        System.out.println("Minimum of three numbers (" + a + ", " + b + ", " + c + ") = " + min);

		        // 2. Check Even or Odd
		        String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
		        System.out.println(num + " is " + evenOdd);

		        // 3. Grade Assignment Based on Score
		        String grade = (score >= 90) ? "A"
		                      : (score >= 80) ? "B"
		                      : (score >= 70) ? "C"
		                      : (score >= 60) ? "D"
		                      : "F";
		        System.out.println("Score: " + score + " → Grade: " + grade);

		        // 4. Check If Number is Positive or Negative
		        String posNeg = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
		        System.out.println(number + " is " + posNeg);

		        // 5. Absolute Value
		        int absValue = (absNum < 0) ? -absNum : absNum;
		        System.out.println("Absolute value of " + absNum + " = " + absValue);

		        // 6. Check Leap Year
		        String leapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		                          ? "Leap Year" : "Not a Leap Year";
		        System.out.println(year + " is a " + leapYear);
		    }
		}
