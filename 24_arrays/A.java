class A {

       // AN ARRAY VARIABLE IS A reference variABLE....
     int [] x ;
                      

      public static void main (String[] args) {

          System.out.println(x);

      }
}

//  A.java:7: error: non-static variable x cannot be referenced from a static context
//           System.out.println(x);
//                              ^
// 1 error
