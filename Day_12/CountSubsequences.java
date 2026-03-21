package Day_12;

public class CountSubsequences {

    public static int countSubseq(String str, int i){

        if(i == str.length()) return 1;

        int include = countSubseq(str, i+1);
        int exclude = countSubseq(str, i+1);

        return include + exclude;
    }

    public static void main(String[] args) {
        System.out.println(countSubseq("abc", 0));
    }
}