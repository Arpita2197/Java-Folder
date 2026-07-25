class T {

public static void main(String[] args) {
     
     System.out.println("A");

    if(args.length>0)  {

        System.out.println(args[0]);

    } else {

           throw new MissingCommandLineArgumentException("Expected at least a single integer argument...");
    }

  }      
}

class MissingCommandLineArgumentException extends RuntimeException {

    MissingCommandLineArgumentException () {

    }

       MissingCommandLineArgumentException(String message) {

         super(message);
       }
}
  
  // if no argument pass

//  A
// Exception in thread "main" MissingCommandLineArgumentException: Expected at least a single integer argument...
//         at T.main(T.java:13)