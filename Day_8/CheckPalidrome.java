package Day_8;

public class CheckPalidrome {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("mam");

        // original copy save karo
        String original = sb.toString();

        // reverse karo
        sb.reverse();

        if (original.equals(sb.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}