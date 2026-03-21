package Day_12;

public class ArraySubsequence {

    public static void printSubseq(int[] arr, int i, String curr){

        if(i == arr.length){
            System.out.println(curr);
            return;
        }

        // include
        printSubseq(arr, i+1, curr + arr[i] + " ");

        // exclude
        printSubseq(arr, i+1, curr);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        printSubseq(arr, 0, "");
    }
}
