package Day_9;

public class AnagramWithoutSorting {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

         if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
            return;
         }

         int[] count =new int[26];
         for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) -'a']++;
            count[s2.charAt(i)-'a']--;

         }
         for(int i=0; i<26; i++){
            if(count[i]!=0){
                System.out.println("Not Anagram");
                return;
            }
         }
          System.out.println("Anagram");
    }
    
}
