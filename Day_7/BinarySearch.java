package Day_7;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr={2,4,6,8,10};
        int key=10;

        int left=0;
        int right = arr.length;

        while (left<right) {
            int mid=(left+right)/2;

            if(arr[mid] == key){
                System.out.println("Element found at index " +mid);
                return;
            }
            else if(arr[mid] < key){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println("Not found");
    }
    
}
