package Day_15;

public class CountSwaps {

    public static void bubbleSort(int[] arr){

        int n = arr.length;
        int count = 0;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    count++; // count swaps
                }
            }
        }

        System.out.println("Total swaps = " + count);
    }

    public static void main(String[] args){

        int[] arr = {5,3,2,4};

        bubbleSort(arr);
    }
}
