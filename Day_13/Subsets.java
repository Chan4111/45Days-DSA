package Day_13;

public class Subsets {

    public static void printSubsets(String str, int i, String curr){

        if(i == str.length()){
            System.out.println(curr);
            return;
        }

        // choose
        printSubsets(str, i+1, curr + str.charAt(i));

        // unchoose (backtrack)
        printSubsets(str, i+1, curr);
    }

    public static void main(String[] args) {
        printSubsets("ab", 0, "");
    }
}
