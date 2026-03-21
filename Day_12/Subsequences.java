package Day_12;

public class Subsequences {
    public static void printSubseq(String str, int i, String curr){
        //Base case
        if(i == str.length()){
            System.out.println(curr);
            return;
        }

        //Include current character
        printSubseq(str, i+1, curr+str.charAt(i));

        //Exclude current character
        printSubseq(str, i+1, curr);

    }
    public static void main(String[] args) {
        String str = "abcd";
        printSubseq(str, 0, "");
    }

}

