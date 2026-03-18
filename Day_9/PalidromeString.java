package Day_9;

public class PalidromeString {
    public static void main(String[] args){
        //Approach 1 use kr rahe hai 
        String str ="mad";
        String rev = ""; // yha hum reverse string ko store karege

        for(int i =str.length()-1; i>=0; i--){

            rev = rev+str.charAt(i);
            
        }
        if(str.equals(rev)){
            System.out.println("Given String is Palidrome");
        }
        else{
            System.out.println("Given String is not Palidrome");
        }
    }
    
}
