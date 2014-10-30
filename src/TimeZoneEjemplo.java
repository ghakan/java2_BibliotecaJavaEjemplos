import java.util.*;

public class TimeZoneEjemplo {
   public static void main( String args[] ){
       
      // create time zone object     
      TimeZone timezone = TimeZone.getDefault();
      
      // checking time zone value     
      System.out.println("Time zone:" + timezone.getTimeZone("GMT-8:00"));
   }    
}
