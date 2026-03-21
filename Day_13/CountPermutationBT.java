package Day_13;

public class CountPermutationBT {

    static int count = 0;

    public static void permute(String str, String ans){

        if(str.length() == 0){
            count++;
            return;
        }

        for(int i = 0; i < str.length(); i++){

            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);

            permute(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        permute("abc", "");
        System.out.println(count);
    }
}
