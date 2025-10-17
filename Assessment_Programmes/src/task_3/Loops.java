package task_3;

public class Loops {

	public static void main(String[] args) {
				
		
				// 1. while Loop: Print numbers from 1 to 5
		        System.out.println("Using while loop:");
		        int i = 1;
		        while (i <= 5) {
		            System.out.println(i);
		            i++;
		        }

		        // 2. do-while Loop: Print numbers from 1 to 5
		        System.out.println("\nUsing do-while loop:");
		        int j = 1;
		        do {
		            System.out.println(j);
		            j++;
		        } while (j <= 5);

		        // 3. for Loop: Print numbers from 1 to 5
		        System.out.println("\nUsing for loop:");
		        for (int k = 1; k <= 5; k++) {
		            System.out.println(k);
		        }

		        // 4. Enhanced for Loop: Print all elements of an array
		        System.out.println("\nUsing enhanced for loop:");
		        int[] numbers = {10, 20, 30, 40, 50};
		        for (int num : numbers) {
		            System.out.println(num);
		        }
		    }
		}

