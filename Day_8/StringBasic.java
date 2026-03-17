package Day_8;

public class StringBasic {
    
    public static void main(String[] args) {
        //create a string
        String str1="chandan"; // String jo hota hai wo immutable hota hai

        // How Print String
        System.out.println(str1);

        //length find
        System.out.println(str1.length());

        //string se character kaise find kre 
        //CharAt
        System.out.println(str1.charAt(2));  // ye jo output dega wo 'a' jo 3 index of string pr hai

        //How to compare two String
        String str2= "chandan";
        String str3= "Thakur";

        //.equals()
        System.out.println(str1.equals(str2));  // true
        System.out.println(str1.equals(str3));  //false

        //Reverse of String
        String rev="";  // ye ek null string liye taki char ko store kr skre
         for(int i=str1.length()-1; i>=0; i--){
            rev=rev+str1.charAt(i);
         }
         System.out.println("Reversed String is :" +rev);  // "nadnahc" ye output hoga

         // ye jo reverse of String hai uska time 0(n2)
         // very slow hai kyu ki ye immutable hai
         // esi liye Hum "StringBuilder" ka use kret hai
    }
}
