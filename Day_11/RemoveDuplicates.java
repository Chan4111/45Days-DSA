package Day_11;

public class RemoveDuplicates {

    public static void removeDup(String str, int idx, String result, boolean[] map){

        if(idx == str.length()){
            System.out.println(result);
            return;
        }

        char curr = str.charAt(idx);

        if(map[curr - 'a'] == true){
            removeDup(str, idx+1, result, map);
        } else {
            map[curr - 'a'] = true;
            removeDup(str, idx+1, result + curr, map);
        }
    }

    public static void main(String[] args) {
        removeDup("aabbcc", 0, "", new boolean[26]);
    }
}
