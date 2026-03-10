public class loop {
    public static void main(String[] args) {

        // print a number
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " \n");
        }

        //use in string
        String[] names = { "Sweta", "Gudly", "Amiya" };

        for (String name : names) {
            System.out.println("Name: " + name);
        }
        System.out.println("\n");

        // Java program to demonstrates 
       // the working of while loop
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        // Java program to demonstrates 
        // the working of do-while loop
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);

        // Java program demonstrates 
        // modification in i variable
        for (int k = 0; k < 5; k++) {
            if (k == 2) {
              
                // Modifies the loop variable and skips
                // the next iteration
                k++;
            }
            System.out.println(k);
        }
    }
}
