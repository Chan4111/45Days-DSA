package Day_20;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr={2,5,4,6,3,5,8};
        int target=10;
        int[] result =twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}
