package Day_15;

public class DescendingBubbleSort {

    public static void sortDesc(int[] arr){

        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){

                if(arr[j] < arr[j+1]){ // change yahi hai

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {4,5,78,21,65};

        sortDesc(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
