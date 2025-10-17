package task_10_Overloading;

import java.util.Arrays;

public class Sortingarrays {

    // Method to sort integer array
    void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted integer array: " + Arrays.toString(arr));
    }

    // Method to sort double array
    void sortArray(double[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted double array: " + Arrays.toString(arr));
    }

    // Method to sort string array
    void sortArray(String[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted string array: " + Arrays.toString(arr));
    }

    // Main method to test
    public static void main(String[] args) {
    	Sortingarrays sorter = new Sortingarrays();

        int[] intArr = {5, 2, 9, 1, 7};
        double[] doubleArr = {3.2, 1.5, 4.7, 2.8};
        String[] stringArr = {"Banana", "Apple", "Mango", "Cherry"};

        sorter.sortArray(intArr);
        sorter.sortArray(doubleArr);
        sorter.sortArray(stringArr);
    }
}

