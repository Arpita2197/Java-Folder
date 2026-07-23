 class K   extends RuntimeException {

    public static void main(String[] args) throws Throwable{

        // Error x = new Error();       // unchecked exception...

      // Exception x = new Exception();
                                                 // proves that Exception & Throwable are of Checked category...
      Throwable x = new Throwable();

      //  ArithmeticException x = new ArithmeticException();

     //  K x  = new K();

     // Object x = new Object();

       throw x;
    }

}