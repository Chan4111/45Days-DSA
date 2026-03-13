package Day_4;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={4,5,6,1,10,20,30};

        int max=arr[0];

        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximun element of the array is :" +max);
    }
    
}
