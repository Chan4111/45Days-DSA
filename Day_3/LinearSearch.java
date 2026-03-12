package Day_3;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 14, 24, 35, 45, 52 };
        int key = 24; // ye key jo element hai jo element hme search krna ho

        // ab ek hum loop chalayege aur traversal kr ke check krege aur match krege at
        // index ke accourding
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("the element is present at index " + i + "th and the vakue is : " +arr[i]);
            }
        }
    }
}
