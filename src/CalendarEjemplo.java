import java.util.*;

public class CalendarEjemplo {

   public static void main(String[] args) throws InterruptedException {

      // create a calendar
      Calendar cal = Calendar.getInstance();

      // print current time
      System.out.println(" Current time is : " + cal.getTime());

      // add a delay of 2 seconds
      Thread.sleep(2000);

      // create a new calendar
      Calendar cal2 = Calendar.getInstance();
	  
      // print the next time
      Date d = cal2.getTime();
      System.out.println(" Next time is : " + d);

   }
}
