package Day_3;

public class findlargest {
    
    // yha hum largest element find krne ke liye linarSearch technique apply kr rahe hai
    public static void main(String[] args) {
        int[] arr={5,40,65,41,32,98,42};

        int largest= arr[0];

        for(int i=1; i< arr.length-1; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("the largest value is : " +largest);
    }
}
