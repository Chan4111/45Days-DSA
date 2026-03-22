package Day_14;

public class SubsetSum {

    public static void findSubsets(int[] arr, int index, int sum, int target, String curr){

        if(index == arr.length){

            if(sum == target){
                System.out.println(curr);
            }

            return;
        }

        // include
        findSubsets(arr, index + 1, sum + arr[index], target, curr + arr[index] + " ");

        // exclude
        findSubsets(arr, index + 1, sum, target, curr);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,1};
        int target = 2;

        findSubsets(arr, 0, 0, target, "");
    }
}
