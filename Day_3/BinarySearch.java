package Day_3;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int k = 40;
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {

            int mid =(l+r)/2;

            if(arr[mid] == k){
                System.out.println("the searched value at index "  +mid);
                break;
            }

            else if(arr[mid] < k){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
    }
}
