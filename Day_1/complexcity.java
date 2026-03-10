public class complexcity {
    public static void main(String[] args) {
        // O(1) for Constant
        int a = 10;
        System.out.println(a);

        int n=10;
        // for linear 0(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // for Logarithmic O(n²)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
        

    }
}
