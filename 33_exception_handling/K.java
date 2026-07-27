import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

class D1 {

    void pro() throws FileNotFoundException {

    }
}

class D2 extends D1 {

    // ok: throws wider exception... 
    void pro() throws IOException  {

    }
}

//  K.java:15: error: pro() in D2 cannot override pro() in D1
//     void pro() throws IOException  {
//          ^
//   overridden method does not throw IOException
// 1 error
