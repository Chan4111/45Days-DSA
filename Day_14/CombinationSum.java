package Day_14;

public class CombinationSum {

    public static void find(int[] arr, int index, int target, String curr){

        if(target == 0){
            System.out.println(curr);
            return;
        }

        if(target < 0 || index == arr.length) return;

        // include (same index again)
        find(arr, index, target - arr[index], curr + arr[index] + " ");

        // exclude
        find(arr, index + 1, target, curr);
    }

    public static void main(String[] args) {

        int[] arr = {2,3,6,7};
        int target = 7;

        find(arr, 0, target, "");
    }
}