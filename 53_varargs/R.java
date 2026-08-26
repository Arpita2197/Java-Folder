class R {           // heterogenous records rakh sakta hai.............

     static void pro(Object...x) {

           for( Object nx: x)
           System.out.println(nx);
     }

      public static void main(String[] args) {

         pro("om",21,new Student(),X.A,new WW(){});
      }
}

enum X {

     A,B;

  }


  class Student {

    
  }

  interface WW {


  }