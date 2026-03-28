package Day_20;

import java.util.HashMap;
import java.util.Map;

public class Basic_HashMaps {
   public static void main(String[] args) {
     ///Syntax of HashMaps
    HashMap<String,Integer> map= new HashMap<>();

   //1 Insert(put)
   map.put("Chandan",21);
   map.put("satyam", 45);
   map.put("Rahul", 22);
   map.put("prashant", 25);

   //To Print 
   System.out.println(map);

   //2 Get Value
   System.out.println(map.get("Chandan"));
   System.out.println(map.get("prashant"));

   //3 Check Key
    System.out.println( map.containsKey("Chandan"));   //true
    System.out.println( map.containsKey("Mohit"));   //false 

   //4 Remove
   System.out.println(map.remove("Rahul"));

   //5 size
   System.out.println(map.size());

   //6 Update Value
   System.out.println(map.put("purushootam", 32));
   System.out.println(map);
   System.out.println(map.size());

   //Iteration Methods

   //Method 1: keySet()
   for(String key:map.keySet()){                              
    System.out.println(key + " " +map.get(key));
   }

  //Method 2:entryset()
  for(Map.Entry<String,Integer> e:map.entrySet()){
    System.out.println(e.getKey() + " " +e.getValue());
  }

// satyam 45
// purushootam 32
// prashant 25
// Chandan 21
   }
}
