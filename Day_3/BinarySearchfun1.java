package Day_3;

import java.util.Scanner;

public class BinarySearchfun1 {
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


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int left=0;
        int right=arr.length-1;
        int result=binarysearch(arr, left, right, key);

        if( result == -1){
            System.out.println(" the element is not required " +result);
        }
        else{
            System.out.println("the Searched element is :" +result);
        }
        sc.close();
    }
}
