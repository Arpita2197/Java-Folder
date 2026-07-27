class F1 {

    void pro() throws ArrayIndexOutOfBoundsException {

    }
}

class F2 extends F1 {
    
    // ok: ignore... hint: IndexOutOfBoundsException is an Unchecked Exception
    void pro() throws IndexOutOfBoundsException  {

    }
}