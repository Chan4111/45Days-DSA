package Day_4;

public class MaxMin {
    public static int findmax(int arr[]){
        int max=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findmin(int arr[]){
        int min=arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a={15,42,61,37,98,96,2,13};

        int max=findmax(a);
        int min=findmin(a);

        System.out.println("the maximum element is :" +max);
        System.out.println("the maximum element is :" +min);
    }
    
}
