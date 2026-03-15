package Day_6;

public class RangeSum {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8};
        int n = arr.length;

        int L = 1;
        int R = 3;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int sum;

        if(L == 0){
            sum = prefix[R];
        } else {
            sum = prefix[R] - prefix[L-1];
        }

        System.out.println("Sum from index " + L + " to " + R + " = " + sum);

    }

}