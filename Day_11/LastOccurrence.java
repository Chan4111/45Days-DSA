package Day_11;

public class LastOccurrence {
    public static int findLast(int[] arr, int key, int i){

        if(i == arr.length) return -1;

        int idx = findLast(arr, key, i+1);

        if(idx == -1 && arr[i] == key){
            return i;
        }

        return idx;
    }
}
