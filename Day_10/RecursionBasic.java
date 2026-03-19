package Day_10;

public class RecursionBasic {
    //jab hum same function ko bar bar call krte hai to recursion bolte hai
    //Example
    public static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);

        System.out.println(n);
    }
    public static void main(String[] args) {
        printNum(5);
    }
    
}
