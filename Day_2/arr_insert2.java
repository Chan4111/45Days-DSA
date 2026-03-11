package Day_2;

import java.util.Arrays; // Arrays class use kar rahe hain taaki array ko easily print kar sakein

public class arr_insert2 {

    /*
     * Ye method ek array me nayi value insert karta hai
     * Parameters:
     * arr -> original array
     * position -> jis index par value insert karni hai
     * value -> jo value insert karni hai
     * 
     * Return:
     * new array jisme inserted value hogi
     */
    public static int[] insertElement(int[] arr, int position, int value) {

        // Naya array banate hain jiska size original array se 1 jyada hoga
        // Kyunki hume ek extra element insert karna hai
        int[] newArr = new int[arr.length + 1];

        /*
         * Yaha do variable use kar rahe hain
         * i -> new array ko traverse karega
         * j -> old array ko traverse karega
         */
        for (int i = 0, j = 0; i < newArr.length; i++) {

            // Agar current index wahi hai jahan insert karna hai
            if (i == position) {

                // To new array me value insert kar do
                newArr[i] = value;

            } else {

                /*
                 * Agar insert position nahi hai
                 * To old array ka element new array me copy karo
                 */
                newArr[i] = arr[j];

                // Old array ka index aage badha do
                j++;
            }
        }

        // Naya array return kar dete hain
        return newArr;
    }

    public static void main(String[] args) {

        // Original array
        int[] arr = {10, 20, 30, 40};

        // Insert karne ki position
        int position = 2;

        // Insert hone wali value
        int value = 25;

        /*
         * Method ko call kar rahe hain
         * Ye method new array return karega
         */
        int[] result = insertElement(arr, position, value);

        // Final array print kar rahe hain
        System.out.println(Arrays.toString(result));
    }
}