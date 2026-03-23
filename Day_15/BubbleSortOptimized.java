package Day_15;

public class BubbleSortOptimized {
    
    public static void bubblesort(int[] arr){

        int n = arr.length;

        for(int i = 0; i < n-1; i++){

            boolean swapped = false;

            for(int j = 0; j < n-i-1; j++){

                // condition check missing tha ❗
                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            // optimization
            if(swapped == false){
                return;
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {4,5,78,21,65,94,32};

        bubblesort(arr);

        for(int nums : arr){
            System.out.print(nums + " ");
        }
    }
}