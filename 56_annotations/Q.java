class Q1 {

     static int pro() {
       
        @Deprecated  
        int y =10;   // local var of pro()

         System.out.println(y);

          return 0;
     }
}

class Q  {

    public static void main(String[] args) {

         Q1 a = new Q1();

         System.out.println(a);
    }
}

// Use of the @Deprecated annotation on a local variable declaration or on a parameter declaration or a package declaration -
// has no effect on the warnings issued by a compiler.