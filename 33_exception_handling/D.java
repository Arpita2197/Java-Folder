import java.io.FileReader;
import java.io.FileNotFoundException;

class Y2 { 


        Y2() throws FileNotFoundException {

            FileReader r = new FileReader("abc.txt");        
     }

}

class D extends Y2 {

     D()  {

         try {

            super();

         }  catch(FileNotFoundException e) {
            e.printStackTrace();
         }

     }

      public static void main(String[] args) throws FileNotFoundException {

           System.out.println("A");

        D a = new D();

        System.out.println("C");

      }
}

//  D.java:20: error: call to super must be first statement in constructor
//             super();
//                  ^
// 1 error
