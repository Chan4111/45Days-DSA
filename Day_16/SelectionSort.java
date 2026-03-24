package Day_16;

public class SelectionSort {

    public static void selectionsort(int[] arr){

        int n = arr.length;

        for(int i = 0; i < n - 1; i++){

            int minIndex = i;

            // minimum find karna
            for(int j = i + 1; j < n; j++){

                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {29,10,14,37,13};

        selectionsort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}