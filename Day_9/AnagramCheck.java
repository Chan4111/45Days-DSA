package Day_9;

import java.util.Arrays;

//Apporach 1
public class AnagramCheck {
    // anagram do String same characters se bane ho, order different ho skta hai
    public static void main(String[] args) {
        
    String str1="Listen";
    String str2="silent";

    // length check
    if(str1.length() != str2.length()){
        System.out.println("Not Anagram");
        return;
    }

    char[] arr1= str1.toCharArray();
    char[] arr2=str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    if(Arrays.equals(arr1, arr2)){
        System.out.println("Anagram");
    }
    else{
        System.out.println("Not Anagram");
    }

    }
}
