import java.io.FileReader;
import java.io.FileNotFoundException;

class Y2 { 


        Y2() throws FileNotFoundException {

            FileReader r = new FileReader("abc.txt");
        
     }

}

class A extends Y2 {

     A() {

        super();
     }

      public static void main(String[] args) {

           System.out.println("A");

        A a = new A();

        System.out.println("B");

      }
}

//  A.java:19: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         super();
//              ^
// 1 error