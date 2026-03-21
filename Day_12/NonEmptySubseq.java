package Day_12;

public class NonEmptySubseq {

    public static void printSubseq(String str, int i, String curr){

        if(i == str.length()){
            if(curr.length() > 0){
                System.out.println(curr);
            }
            return;
        }

        printSubseq(str, i+1, curr + str.charAt(i));
        printSubseq(str, i+1, curr);
    }

    public static void main(String[] args) {
        printSubseq("abc", 0, "");
    }
}
