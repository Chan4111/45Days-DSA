package Day_14;

public class Combinations {

    public static void combine(String str, int index, String curr){

        if(curr.length() > 0){
            System.out.println(curr);
        }

        for(int i = index; i < str.length(); i++){

            // choose
            curr = curr + str.charAt(i);

            // explore
            combine(str, i + 1, curr);

            // backtrack (undo)
            curr = curr.substring(0, curr.length() - 1);
        }
    }

    public static void main(String[] args) {
        combine("abc", 0, "");
    }
}
