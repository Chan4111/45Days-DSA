package Day_2;

import java.util.Arrays;

public class arr_traverse {
    public static void main(String[] args) {
        // Simple array traversal
        int[] arr = { 44, 6, 7, 1, 14, 54, 32, 98, 12, 11 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Array Format:");
        System.out.println(Arrays.toString(arr)); 

        System.out.println("\n This is multiple error :");
        // Multiple array
        int[][] arr1 = {
                { 1, 5, 4, 6, 7 },
                { 5, 9, 8, 7, 5 },
                { 4, 5, 7, 8, 6 },
                { 4, 8, 7, 9, 4 },
                { 5, 8, 7, 4, 6 }
        };
        // Simple traversal kr rahe hai
        for (int j = 0; j < arr1.length; j++) {
            for (int k = 0; k < arr1.length; k++) {
                System.out.println(arr1[j][k]);
            }
        }
        System.out.println("\nMatrix Format:");
        // Multiple Array (Matrix)
        for (int j = 0; j < arr1.length; j++) {
            for (int k = 0; k < arr1[j].length; k++) {
                System.out.print(arr1[j][k] + " "); // Ek line mein print karne ke liye
            }
            System.out.println(); // Har row ke baad line badalne ke liye
        }

    }
}
