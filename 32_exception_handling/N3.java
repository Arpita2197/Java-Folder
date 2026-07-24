import java.io.FileReader;
import java.io.FileNotFoundException;

class N3 {

    public static void main(String[] args) {

       System.out.println("S");
        try{
            aaa();
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }     
       System.out.println("E");
    }


 static void aaa()throws FileNotFoundException {
        
       System.out.println("Q");
       bbb();
       System.out.println("K");
 }

 static void bbb() throws FileNotFoundException {
        
       System.out.println("J");
       ccc();
       System.out.println("D");
 }

  static void ccc() throws FileNotFoundException {
    
       System.out.println("Y");
 
       FileReader x = new FileReader("abc.txt");
     
       System.out.println("H");
     
 }

 }

//  S
// Q
// J
// Y
// java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
// E