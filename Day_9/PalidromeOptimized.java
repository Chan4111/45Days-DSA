package Day_9;

public class PalidromeOptimized {
    // Here we are using two pointer(Best)
    public static void main(String[] args){
        String str ="madam";

        int left=0;
        int right=str.length()-1;
        boolean ispalindrome = true;

        while(left<right){
        if(str.charAt(left) != str.charAt(right)){
            ispalindrome =false;
            break;
        }
        left++;
        right--;
        
        }
        if(ispalindrome){
            System.out.println(" The above String is Palindrome");
        }
        else{
            System.out.println(" The above String is Not Palidrome");
        }
    }
    
}
