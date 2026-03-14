package Day_5;

public class MajorityElement {
        public static void main(String[] args) {

        int[] arr = {2,2,1,1,2,2,3};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int count = 0;

            // Count occurrences of arr[i]
            for(int j = 0; j < n; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }

            // Check if count > n/2
            if(count > n/2){
                System.out.println("Majority element = " + arr[i]);
                break;
            }
        }

    }
    
}
