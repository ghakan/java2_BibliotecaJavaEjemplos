import java.io.Console;
import java.util.Scanner;

public class ConsoleEjemplo {
   public static void main(String[] args) {
      
      Console cnsl = null;
      Scanner scan = null;
      
      try{
         // creates a console object
         cnsl = System.console();

         // if console is not null
         if (cnsl != null) {
            
            // prints
            System.out.print("Enter name : ");
            
            // create new scanner object
            scan = new Scanner(cnsl.reader());
            
            // read till the end of data
            while (scan.hasNext()) {
               
               // read next
               String str = scan.next();
               
               // print
               System.out.println(str);
            }
         }      
      }catch(Exception ex){
         
         // if any error occurs
         ex.printStackTrace();      
      }
   }
}
