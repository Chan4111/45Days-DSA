package Day_20;

import java.util.*;

public class SubarraySum {
    public static int subarraySum(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1); // important

        int sum = 0;
        int count = 0;

        for(int num : arr){
            sum += num;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,2,7,6};
        int key =2;

        int result = subarraySum(arr, key);
        System.out.println(result);
    }
}
