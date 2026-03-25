package Day_17;

public class InsertionSortDec {

    public static void insertionsortdec(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int key = arr[i];
            int j=i-1;

            while (j>=0 && arr[j]<key) {  // arr[j]<key hi decreasing order dega
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] arr ={2,4,5,3,7};

        insertionsortdec(arr);

        for (int i : arr) {
            System.out.println(i +"");
        }
    }
    
}
