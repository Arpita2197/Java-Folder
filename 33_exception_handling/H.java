import java.io.FileNotFoundException;
import java.io.EOFException;



class X1 {

    void pro() throws FileNotFoundException,EOFException {


    }
}

class X2 extends X1  {

           // ok: throws fewer exception.... 
      void pro()  throws FileNotFoundException {


    }
}