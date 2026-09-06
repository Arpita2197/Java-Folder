class O1 {
   
    @Deprecated
   static void info() {

         System.out.println("HI");
    }
}

class O extends O1 {
 
  @Deprecated
  static  void pro() {

        System.out.println("Helloooo");
    }

     public static void main(String[] args) {

         pro();

         O1.info();
     }
}

//  Note: O.java uses or overrides a deprecated API.
// Note: Recompile with -Xlint:deprecation for details.
