package Day_4;

public class ReverseArray {
    public static void main(String[] args) {

        // yha hum array ko reverse karege
        // step 1
        int[] arr = { 5, 6, 7, 8, 49, 6, 2, 1 };

        int start = arr[0];
        int end = arr.length - 1;

        // ab hum two pinter ka use kr ke array ko reverse karege
        while (start<end) {
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end]=temp;  

            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i] +" ");
        }
        
    }
}
