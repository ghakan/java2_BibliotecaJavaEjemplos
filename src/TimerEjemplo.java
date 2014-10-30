import java.util.*;

public class TimerEjemplo {
   public static void main(String[] args) {
      // creating timer task, timer
      TimerTask tasknew = new TimerCancel();
      Timer timer = new Timer();
      
      // scheduling the task
      timer.scheduleAtFixedRate(tasknew, new Date(), 10); 
      
      // cancel task
      timer.cancel();
      
      // purging the timer
      System.out.println("purge value :"+timer.purge());      
   }
   // this method performs the task
   public void run() {
      System.out.println("working on");      
   }    
}
