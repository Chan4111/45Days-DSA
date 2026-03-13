package Day_4;

public class MinElement {
    public static void main(String[] args){
        int[] arr={14,2,51,46,85,74,12,36};

        int min= arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Min Element ofrequired array is :" +min);
    }
}
