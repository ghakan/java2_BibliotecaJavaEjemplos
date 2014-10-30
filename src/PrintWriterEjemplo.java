import java.io.*;

public class PrintWriterEjemplo {

   public static void main(String[] args) {
      try {

         // create a new stream at system
         PrintWriter pw = new PrintWriter(System.out);

         // append chars
         pw.append('H');
         pw.append('e');
         pw.append('l');
         pw.append('l');
         pw.append('o');

         // flush the writer
         pw.flush();

      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}
