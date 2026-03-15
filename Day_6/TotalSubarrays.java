package Day_6;

public class TotalSubarrays {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int n = arr.length;

        int total = n * (n + 1) / 2;

        System.out.println("Total number of subarrays = " + total);

    }

}