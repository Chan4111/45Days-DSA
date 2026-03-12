package Day_3;

public class checkelement {

    public static void main(String[] args) {

        int[] arr = {5,40,65,41,32,98,42};

        int check = 41;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == check){
                found = true;
                break;
            }

        }

        if(found){
            System.out.println("Element exists in array");
        }else{
            System.out.println("Element does not exist");
        }

    }
}