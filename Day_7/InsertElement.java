package Day_7;

public class InsertElement {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};

        int size =4;
        int position =2;
        int Element=25;

        for(int i=size; i>position; i--){
            arr[i] = arr[i-1];
        }

        arr[position] =Element;
        size++;

        for(int i=0; i<size; i++){
            System.out.println(arr[i] + " ");
        }

    }
    
}
