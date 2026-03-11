package Day_2;

public class arr_delete {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40};
        int size=4;
        int postion=1;
        for(int i=postion; i<size-1; i++){
            arr[i] =arr[i+1];
        }
        size--;
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
