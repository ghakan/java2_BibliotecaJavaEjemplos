import java.util.*;

public class HashSetEjemplo {
   public static void main(String args[]) {
      // create hash set
      HashSet <String> newset = new HashSet <String>();      
      
      // populate hash set
      newset.add("Learning"); 
      newset.add("Easy");
      newset.add("Simply");  
            
      // checking elements in hash set
      System.out.println("Hash set values: "+ newset);
   }    
}
