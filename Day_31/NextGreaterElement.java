package Day_31;

import java.util.*;

public class NextGreaterElement {

    public static void findNGE(int arr[]) {
        int n = arr.length;
        int result[] = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Assign result
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push current element
            stack.push(arr[i]);
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " → " + result[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10};
        findNGE(arr);
    }
}
