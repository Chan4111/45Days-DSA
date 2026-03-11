package Day_2;

public class arr_basic {
    public static void main(String[] args) {
        // Basic array ko declear krna
        int[] arr = { 1, 2, 3, 4, 5, 7 }; // ye hum stating me hi array me value aasign kr dete hai
        // aur ek sath sab ko print krna hoga to mujhe travese krwana hoga with loop
        for (int i = 0; i < arr.length; i++) {

            // sara element ko print krwa lete hai
            System.out.println(arr[i]);


        }
        System.out.println("Second array value :" );


        // Second array
        // ab Hum chahte hai ki size intialize kre aur traversal krwaye 
        int [] arr1= new int[5];
        arr1[0]=45;
        arr1[1]=5;
        arr1[2]=46;
        arr1[3]=10;
        arr1[4]=78; // agar array ka size n ho to wo 0 se start hota hai aur n-1 tk hi check krta hai

        for(int j=0; j < arr1.length;j++){
            System.out.println(arr1[j]);
        }


    }

}