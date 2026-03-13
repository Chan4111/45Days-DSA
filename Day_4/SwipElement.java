package Day_4;

public class SwipElement {
    public static void main(String[] args) {
        // yha pr kewal first and last wala element swip ho
        // means 0 index swip with last index
        int[] arr = { 12, 54, 63, 45, 8, 79 };
        // jaise 12 <--> 79
        // {79,54,63,45,8,12}

        int n = arr.length - 1;

        int temp = arr[0];
        arr[0] = arr[n];
        arr[n] = temp; 

        for (int i = 0; i <= n; i++) {
            System.out.println( arr[i] + "");

        }
    }

}
