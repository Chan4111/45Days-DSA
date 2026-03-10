public class array {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\n");
        // find maximum in array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maxmium number is: "+max);
    }
}
