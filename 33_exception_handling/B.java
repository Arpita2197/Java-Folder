import java.io.FileReader;
import java.io.FileNotFoundException;

class Y2 { 


        Y2() throws FileNotFoundException {

            FileReader r = new FileReader("abc.txt");        
     }

}

class B extends Y2 {

     B()  throws FileNotFoundException {

        super();
     }

      public static void main(String[] args) {

           System.out.println("A");

        B a = new B();

        System.out.println("B");

      }
}

 // Z2.java:18: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         Z2 a = new Z2();
//                ^
// 1 error