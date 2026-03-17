package Day_8;

public class ReverseSb {
    public static void main(String[] args) {
        // Reverse by using String 
        String str ="Hello Chandan";
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println("Reversed of String " +str+ " is : " +sb);
    }
}
