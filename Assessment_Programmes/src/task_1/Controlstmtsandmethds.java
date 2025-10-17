package task_1;

public class Controlstmtsandmethds {

	public class MultiTaskProgram {

	    // 1. Sum of Digits
	    public static int sumOfDigits(int n) {
	        int sum = 0;
	        while (n > 0) {
	            sum += n % 10;
	            n /= 10;
	        }
	        return sum;
	    }

	    // 2. Armstrong Number Checker
	    public static boolean isArmstrong(int n) {
	        int temp = n, sum = 0;
	        int digits = String.valueOf(n).length();
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, digits);
	            temp /= 10;
	        }
	        return sum == n;
	    }

	    // 3. GCD Calculator
	    public static int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    // 4. LCM Calculator
	    public static int lcm(int a, int b) {
	        return (a * b) / gcd(a, b);
	    }

	    // 5. Number to Words (for numbers 0–9 for simplicity)
	    public static String numberToWords(int n) {
	        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	        String result = "";
	        while (n > 0) {
	            int digit = n % 10;
	            result = words[digit] + " " + result;
	            n /= 10;
	        }
	        return result.trim();
	    }

	    // 6. Vowel or Consonant
	    public static String vowelOrConsonant(char ch) {
	        ch = Character.toLowerCase(ch);
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	            return "Vowel";
	        else if (Character.isLetter(ch))
	            return "Consonant";
	        else
	            return "Not an alphabet";
	    }

	    // 7. Palindrome String Checker
	    public static boolean isPalindrome(String str) {
	        String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--)
	            reversed += str.charAt(i);
	        return str.equalsIgnoreCase(reversed);
	    }

	    // 8. Sum of Array Elements
	    public static int sumArray(int[] arr) {
	        int sum = 0;
	        for (int num : arr)
	            sum += num;
	        return sum;
	    }

	    // 9. Average of Array Elements
	    public static double averageArray(int[] arr) {
	        return (double) sumArray(arr) / arr.length;
	    }

	    // 10. Search Element in Array
	    public static boolean searchElement(int[] arr, int key) {
	        for (int num : arr)
	            if (num == key)
	                return true;
	        return false;
	    }

	    // Main method to test all
	    public static void main(String[] args) {
	        System.out.println("1. Sum of Digits (1234): " + sumOfDigits(1234));
	        System.out.println("2. Armstrong Number (153): " + isArmstrong(153));
	        System.out.println("3. GCD of 12 and 18: " + gcd(12, 18));
	        System.out.println("4. LCM of 12 and 18: " + lcm(12, 18));
	        System.out.println("5. Number to Words (123): " + numberToWords(123));
	        System.out.println("6. Character 'e' is a: " + vowelOrConsonant('e'));
	        System.out.println("7. Is 'Madam' a palindrome? " + isPalindrome("Madam"));

	        int[] arr = {10, 20, 30, 40, 50};
	        System.out.println("8. Sum of Array: " + sumArray(arr));
	        System.out.println("9. Average of Array: " + averageArray(arr));
	        System.out.println("10. Is 30 in array? " + searchElement(arr, 30));
	    }
	}

}
