package Day_3;

public class LinearSearchfun {

    public static int findlinar(int arr[], int n, int key){

        for(int i=0; i<n; i++){

            if(arr[i] == key)
                return i;

        }

        return -1; // agar key na mile
    }

    public static void main(String[] args){

        int[] a = {12,54,68,32,45,62,15};
        int k = 32;
        int n = a.length;

        int index = findlinar(a,n,k);

        System.out.println("The index value is " + index);

    }
}