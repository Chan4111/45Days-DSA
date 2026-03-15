package Day_6;

public class SubarraySumPrefix{
    
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int L = 1;
        int R = 3;

        int sum;

        if(L == 0){
            sum = prefix[R];
        }else{
            sum = prefix[R] - prefix[L-1];
        }

        System.out.println("Subarray sum = " + sum);

    }
}
