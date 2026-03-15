package Day_6;

import java.util.Arrays;

public class PrefixSumExample {
    public static void main(String[] args){
        int[] arr={1,6,8,4,6,2,3,};
        // hum yha pr array ke prfix ka sum karege 
        // exam agr index=4 to index 4 tk sum de dega

        int n= arr.length;

        int[] prefix= new int[n];
        prefix[0]=arr[0];

        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+arr[i];  // yhi formula se hum sum of prefix nikalte hai
        }
        for(int i=0; i<n; i++){
           // System.out.println("The prefix of array = " +prefix[i] );
           System.out.println(prefix[i] +"");
        }
        System.out.println(Arrays.toString(prefix));
    }
    
}
