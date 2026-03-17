package Day_8;

public class StringBuilderEx {
    // String Builder jo hai wo muttable aur fast hota hai 

    public static void main(String[] args) {
        // create of String Builder

        StringBuilder  sb = new StringBuilder("Chandan");

        // print 
        System.out.println(sb);

        //Method use in String 
        
        //1. append
        sb.append("thakur");
        System.out.println(sb); // Chandanthakur

        //2. CharAt()
        System.out.println(sb.charAt(7)); // t

        //3. setCharAt()
        sb.setCharAt(7, 'k');
        System.out.println(sb); //ChandanKhakur

        StringBuilder sb1= new StringBuilder("Hello");

        //4. insert()
        sb1.insert(1, 'y');
        System.out.println(sb1); //Hyello

        //5. reverse()
        sb1.reverse();
        System.out.println(sb1);


    }
    
}
