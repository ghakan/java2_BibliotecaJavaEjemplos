import java.io.FilePermission;
import java.io.IOException;

public class FilePermissionDemo {
   public static void main(String[] args) throws IOException {
      
      FilePermission fp = null;
      
      try{
         // create new file permissions
         fp=new FilePermission("C://test.txt", "read");
         
         // the canonical string representation of the action
         String s = fp.getActions();
         
         // prints
         System.out.print("Action: "+s);
         
      }catch(Exception ex){
         // if an error occurs
         ex.printStackTrace();
      }
   }
}
