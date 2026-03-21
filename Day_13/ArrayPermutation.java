package Day_13;

public class ArrayPermutation {

    public static void permute(int[] arr, int index){

        if(index == arr.length){
            // print array
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for(int i = index; i < arr.length; i++){

            // swap
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            permute(arr, index + 1);

            // backtrack (undo swap)
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        permute(arr, 0);
    }
}
