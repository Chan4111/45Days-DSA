package Day_20;

import java.util.*;

public class Anagram {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : s2.toCharArray()){
            if(!map.containsKey(ch)) return false;

            map.put(ch, map.get(ch) - 1);

            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";

        boolean ab=isAnagram(s1, s2);
        System.out.println(ab);
    }
}
