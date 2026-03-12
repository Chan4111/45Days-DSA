package Day_3;

import java.util.Scanner;

public class LinaerSearchfun1 {

    public static int findlinar(int arr[], int n, int key){

        for(int i = 0; i < n; i++){

            if(arr[i] == key)
                return i;

        }

        return -1; 
    }

    public static void main(String[] args){

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

        int index = findlinar(arr, n, key);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }else{
            System.out.println("Element not found");
        }

        sc.close();
    }
}