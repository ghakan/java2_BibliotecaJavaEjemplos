public class ArrayEjemplo {
  public static void main (String args[]) {

   // create an array of strings
   String a[] = new String[]{"abc","klm","xyz","pqr"};
   
   List list1 = Arrays.asList(a);

   // printing the list
   System.out.println("The list is:" + list1);
  }
}