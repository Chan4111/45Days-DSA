package Day_2;

import java.util.Arrays;

public class arr_delete1 {

    /*
     * Ye method array se ek element delete karega
     * arr -> original array
     * position -> jis index ka element delete karna hai
     */
    public static int[] deleteElement(int[] arr, int position) {

        // naya array banate hain jiska size 1 kam hoga
        int[] newArr = new int[arr.length - 1];

        /*
         * i -> new array traverse karega
         * j -> old array traverse karega
         */
        for (int i = 0, j = 0; i < arr.length; i++) {

            // agar current index delete position hai to skip kar do
            if (i == position) {
                continue;
            }

            // baki elements new array me copy kar do
            newArr[j] = arr[i];
            j++;
        }

        return newArr;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40,54,84,75,95,41,65};

        int position = 8; // jis index ko delete karna hai

        // method call
        int[] result = deleteElement(arr, position);
        int[] result1 = deleteElement(arr, 4);

        // result print
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
    }
}