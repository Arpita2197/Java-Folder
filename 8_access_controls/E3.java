class A2 {

     private int z = 2929;

      void info() {

          //System.out.println("AYUSHI");

           return z ;
      }
}

class E3 {


    public static void main(String[] args) {

         A2 q = new A2 ();
          
         //  System.out.println(q.z);

          int xx = q.info();

          System.out.println(xx);



    }
}

//  E3.java:9: error: incompatible types: unexpected return value
//            return z ;
//                   ^
// E3.java:22: error: incompatible types: void cannot be converted to int
//           int xx = q.info();
//                          ^
// 2 errors