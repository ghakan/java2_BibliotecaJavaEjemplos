import java.util.*;

public class DateEjemplo {

   public static void main(String[] args) {

      // create a date
      Date date = new Date(97, 1, 23);
      long diff = date.getTime();

      // print how many seconds have passed since January 1, 1970, 00:00:00 GMT
      System.out.println("If date is 23-01-1997, " + diff + " have passed.");

   }
}
