package Day_7;

public class MinElement {
    public static void main(String[] args){
        int[] arr ={8,2,4,5,1,3};

        int min=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("Minmum = " +min);

    }
    
}
