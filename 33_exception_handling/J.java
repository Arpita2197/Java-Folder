import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

class C1 {

    void pro() throws IOException {

    }
}

class C2 extends C1 {

    // ok: throws narrower exception... 
    void pro() throws FileNotFoundException, EOFException  {

    }
}