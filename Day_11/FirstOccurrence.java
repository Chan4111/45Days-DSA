package Day_11;

public class FirstOccurrence {
    public static int find(int[] arr, int key, int i){

        if(i == arr.length) return -1;

        if(arr[i] == key) return i;

        return find(arr, key, i+1);
    }
}
