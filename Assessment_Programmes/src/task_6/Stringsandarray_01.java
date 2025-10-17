package task_6;

public class Stringsandarray_01 {

	public static void main(String[] args) {
		
		        String str1 = "HelloWorld";
		        String str2 = "";
		        String str3 = "java programming";
		        String str4 = "HELLO";
		        String str5 = "hello";
		        String str6 = "programming is fun";
		        String substring = "fun";

		        // 1. Count Characters in a String
		        System.out.println("1. Number of characters in '" + str1 + "': " + str1.length());

		        // 2. Check if a String is Empty
		        System.out.println("2. Is str2 empty? " + str2.isEmpty());

		        // 3. Convert String to Uppercase
		        System.out.println("3. Uppercase: " + str3.toUpperCase());

		        // 4. Convert String to Lowercase
		        System.out.println("4. Lowercase: " + str4.toLowerCase());

		        // 5. Concatenate Two Strings
		        System.out.println("5. Concatenated String: " + str4.concat(str5));

		        // 6. Find the Length of a String
		        System.out.println("6. Length of '" + str6 + "': " + str6.length());

		        // 7. Check if a String Contains a Substring
		        System.out.println("7. Does '" + str6 + "' contain '" + substring + "'? " + str6.contains(substring));

		        // 8. Replace Characters in a String
		        System.out.println("8. Replace 'o' with '0' in '" + str1 + "': " + str1.replace('o', '0'));

		        // 9. Check if Two Strings are Equal
		        System.out.println("9. Are '" + str4 + "' and '" + str5 + "' equal? " + str4.equals(str5));


		        // ---------- ARRAY TASKS ----------
		        int[] arr = {5, 9, 2, 7, 1};

		        // 10. Reverse an Array
		        System.out.print("10. Reversed Array: ");
		        for (int i = arr.length - 1; i >= 0; i--) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();

		        // 11. Find the Sum of Array Elements
		        int sum = 0;
		        for (int num : arr) {
		            sum += num;
		        }
		        System.out.println("11. Sum of elements: " + sum);

		        // 12. Find the Minimum Element in an Array
		        int min = arr[0];
		        for (int num : arr) {
		            if (num < min) min = num;
		        }
		        System.out.println("12. Minimum element: " + min);

		        // 13. Find the Maximum Element in an Array
		        int max = arr[0];
		        for (int num : arr) {
		            if (num > max) max = num;
		        }
		        System.out.println("13. Maximum element: " + max);

		        // 14. Check if an Array Contains a Specific Value
		        int valueToCheck = 7;
		        boolean found = false;
		        for (int num : arr) {
		            if (num == valueToCheck) {
		                found = true;
		                break;
		            }
		        }
		        System.out.println("14. Does array contain " + valueToCheck + "? " + found);

		        // 15. Sort an Array in Ascending Order
		        for (int i = 0; i < arr.length - 1; i++) {
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] > arr[j]) {
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
		        }

		        System.out.print("15. Sorted Array in Ascending Order: ");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		}
