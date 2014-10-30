import java.util.Vector;

public class VectorEjemplo {
   public static void main(String[] args) {
      // create an empty Vector vec   
      Vector<Integer> vec = new Vector<Integer>();

      // use add() method to add elements in the vector
      vec.add(14);
      vec.add(13);
      vec.add(12);
      vec.add(11);
      vec.add(4);
      vec.add(3);
      vec.add(2);
      vec.add(1);

      // let us print the capacity of the vector
      System.out.println("Capacity of the vector is :"+vec.capacity());                 
   }     
}
