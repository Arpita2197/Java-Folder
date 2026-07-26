import java.io.FileReader;
import java.io.FileNotFoundException;

class Y2 { 


        Y2() throws FileNotFoundException {

            FileReader r = new FileReader("abc.txt");        
     }

}

class C extends Y2 {

     C()  throws FileNotFoundException {

        super();
     }

      public static void main(String[] args) throws FileNotFoundException {

           System.out.println("A");

        C a = new C();

        System.out.println("C");

      }
}

//  A
// Exception in thread "main" java.io.FileNotFoundException: aCc.txt (The system cannot find the file specified)
//         at java.base/java.io.FileInputStream.open0(Native Method)
//         at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//         at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
//         at java.base/java.io.FileReader.<init>(FileReader.java:60)
//         at Y2.<init>(C.java:9)
//         at C.<init>(C.java:18)
//         at C.main(C.java:25)
