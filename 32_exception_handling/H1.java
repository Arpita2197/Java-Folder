import java.io.FileNotFoundException;
import java.io.FileReader;

class H1 {

     public static void main(String[] args) {
         
         System.out.println("A");

          try {

             int y = 12 / 0;      // unchecked hai ,  pass by compiler...(kyuki run - time exception ha yeah)

            //  FileReader a = new FileReader("golu.txt");      //(checked by compiler so error)

          } catch(FileNotFoundException e) { // checked exception.....

             System.out.println(e);
          }

              System.out.println("B");
     }
}

//  H1.java:16: error: exception FileNotFoundException is never thrown in body of corresponding try statement
//           } catch(FileNotFoundException e) {
//             ^
// 1 error