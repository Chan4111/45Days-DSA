package Day_3;

public class BinarySearchfun {

    public static int binarysearch( int a[] , int l, int r , int k){
        int m= (l+r)/2;

        if(a[m] == k){
            return m;
        }
        else if(a[m] < k){
            return binarysearch(a, l+1, r, k);
        }
        else{
             return binarysearch(a, l, r+1, k);
        }

    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int left=0;
        int right= arr.length -1;
        int key=50;

        int result=binarysearch(arr, left, right, key);

        if( result == -1){
            System.out.println(" the element is not required " +result);
        }
        else{
            System.out.println("the Searched element is :" +result);
        }
    }
    
    
}
