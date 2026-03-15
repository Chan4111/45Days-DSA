package Day_6;


public class SubarraySum {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int n = arr.length;

        for(int i = 0; i < n; i++){

            int sum = 0;

            for(int j = i; j < n; j++){

                sum = sum + arr[j];

                System.out.println("Subarray sum = " + sum);
            }
        }

    }
    
}
