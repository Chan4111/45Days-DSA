package Day_20;

import java.util.HashMap;

public class Frequency_Count {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 4, 4, 5 };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            // Check Duplicate
            if (map.containsKey(num)) {
                System.out.println("Duplicate Found");
            }
        }
        System.out.println(map);

        //First Non-repeating element
        for(int num:arr){
            if(map.get(num)==1){
                System.out.println(num);
                break;
            }
        }
    }
}
