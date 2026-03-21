package Day_13;

public class CountPermutation {

    public static int count(int n){

        if(n == 0) return 1;

        return n * count(n-1);
    }

    public static void main(String[] args) {
        System.out.println(count(3)); // 6
    }
}