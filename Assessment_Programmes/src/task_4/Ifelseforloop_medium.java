package task_4;

import java.util.*;

public class Ifelseforloop_medium {

		// 1. Print Prime Numbers up to N
		    static void printPrimes(int N) {
		        System.out.println("1. Prime Numbers up to " + N + ":");
		        for (int i = 2; i <= N; i++) {
		            boolean isPrime = true;
		            for (int j = 2; j <= i / 2; j++) {
		                if (i % j == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		            if (isPrime) System.out.print(i + " ");
		        }
		        System.out.println("\n");
		    }

		    // 2. Find LCM of Two Numbers
		    static void findLCM(int a, int b) {
		        int max = (a > b) ? a : b;
		        int lcm = 0;
		        for (int i = max; ; i++) {
		            if (i % a == 0 && i % b == 0) {
		                lcm = i;
		                break;
		            }
		        }
		        System.out.println("2. LCM of " + a + " and " + b + " = " + lcm + "\n");
		    }

		    // 3. Matrix Addition
		    static void matrixAddition() {
		        int[][] A = {{1, 2, 3}, {4, 5, 6}};
		        int[][] B = {{7, 8, 9}, {1, 2, 3}};
		        int[][] sum = new int[2][3];

		        System.out.println("3. Matrix Addition:");
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 3; j++) {
		                sum[i][j] = A[i][j] + B[i][j];
		                System.out.print(sum[i][j] + " ");
		            }
		            System.out.println();
		        }
		        System.out.println();
		    }

		    // 4. Matrix Multiplication
		    static void matrixMultiplication() {
		        int[][] A = {{1, 2}, {3, 4}, {5, 6}};
		        int[][] B = {{7, 8, 9}, {10, 11, 12}};
		        int[][] C = new int[3][3];

		        System.out.println("4. Matrix Multiplication:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                for (int k = 0; k < 2; k++) {
		                    C[i][j] += A[i][k] * B[k][j];
		                }
		                System.out.print(C[i][j] + " ");
		            }
		            System.out.println();
		        }
		        System.out.println();
		    }

		    // 5. Check Perfect Number
		    static void checkPerfect(int num) {
		        int sum = 0;
		        for (int i = 1; i <= num / 2; i++) {
		            if (num % i == 0)
		                sum += i;
		        }
		        if (sum == num)
		            System.out.println("5. " + num + " is a Perfect Number.\n");
		        else
		            System.out.println("5. " + num + " is NOT a Perfect Number.\n");
		    }

		    // 6. Print Armstrong Numbers up to N
		    static void printArmstrong(int N) {
		        System.out.println("6. Armstrong Numbers up to " + N + ":");
		        for (int i = 1; i <= N; i++) {
		            int temp = i, sum = 0, digits = 0;
		            for (int j = i; j > 0; j /= 10) digits++;
		            for (int j = i; j > 0; j /= 10) {
		                int digit = j % 10;
		                int pow = 1;
		                for (int k = 1; k <= digits; k++)
		                    pow *= digit;
		                sum += pow;
		            }
		            if (sum == i) System.out.print(i + " ");
		        }
		        System.out.println("\n");
		    }

		    // 7. Bubble Sort
		    static void bubbleSort(int[] arr) {
		        System.out.println("7. Bubble Sort:");
		        int n = arr.length;
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                if (arr[j] > arr[j + 1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }
		        for (int num : arr) System.out.print(num + " ");
		        System.out.println("\n");
		    }

		    // 8. Sort Array in Ascending Order
		    static void sortAscending(int[] arr) {
		        System.out.println("8. Sort Array in Ascending Order:");
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] > arr[j]) {
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
		        }
		        for (int num : arr) System.out.print(num + " ");
		        System.out.println("\n");
		    }

		    // 9. Find Second Largest Element
		    static void secondLargest(int[] arr) {
		        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] > first) {
		                second = first;
		                first = arr[i];
		            } else if (arr[i] > second && arr[i] != first) {
		                second = arr[i];
		            }
		        }
		        System.out.println("9. Second Largest Element = " + second + "\n");
		    }

		    // 10. Remove Duplicates from Array
		    static void removeDuplicates(int[] arr) {
		        System.out.println("10. Remove Duplicates from Array:");
		        int n = arr.length;
		        for (int i = 0; i < n; i++) {
		            boolean duplicate = false;
		            for (int j = 0; j < i; j++) {
		                if (arr[i] == arr[j]) {
		                    duplicate = true;
		                    break;
		                }
		            }
		            if (!duplicate)
		                System.out.print(arr[i] + " ");
		        }
		        System.out.println();
		    }

		    // Main Method
		    public static void main(String[] args) {
		        printPrimes(50);
		        findLCM(12, 18);
		        matrixAddition();
		        matrixMultiplication();
		        checkPerfect(28);
		        printArmstrong(500);
		        bubbleSort(new int[]{5, 2, 9, 1, 5, 6});
		        sortAscending(new int[]{8, 3, 1, 5, 2});
		        secondLargest(new int[]{12, 35, 1, 10, 34, 1});
		        removeDuplicates(new int[]{1, 2, 2, 3, 4, 4, 5});
		    }
		}
