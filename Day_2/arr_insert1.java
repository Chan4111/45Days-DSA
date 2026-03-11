package Day_2;

public class arr_insert1 {

    public static void main(String[] args) {

        int[][] arr = new int[3][4]; // extra column space

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        int row = 1;        // jis row me insert karna hai
        int position = 1;   // column index
        int value = 10;

        int size = 3; // current columns

        // shift elements right
        for (int i = size; i > position; i--) {
            arr[row][i] = arr[row][i - 1];
        }

        arr[row][position] = value;
        size++;

        // print matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}