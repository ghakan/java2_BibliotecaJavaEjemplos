public class FileDemo {
   public static void main(String[] args) {
      
      File f = null;
      
      try{
         // create new file
         f = new File("c:/test.txt");
         
         // returns true if the file can be read
         boolean bool = f.canRead();
         
         // print
         System.out.print("File can be read: "+bool);
         
      }catch(Exception e){
         // if any I/O error occurs
         e.printStackTrace();
      }
   }
}
