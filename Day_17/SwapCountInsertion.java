package Day_17;

public class SwapCountInsertion {

    public static void swapCountIns(int[] arr){
        int n= arr.length;
        int totalSwap =0;

        for(int i=1; i<n; i++){
            int key =arr[i];
            int j=i-1;

            while (j>=0 && arr[j]<key) {
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = key;
            totalSwap++;
        }
        System.err.println("Total Count of Insertion Sort is :" +totalSwap);
    }

    public static void main(String[] args){
        int[] arr ={5,4,3,8,2,6,1};

        swapCountIns(arr);

        for (int i : arr) {
            System.out.println(i +"");
        }
    }
    
}
