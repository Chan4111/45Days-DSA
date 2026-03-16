package Day_7;

public class DeleteElement {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40};
        int size = 4;
        int position = 1;

        for(int i = position; i < size - 1; i++){
            arr[i] = arr[i+1];
        }

        size--;

        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
