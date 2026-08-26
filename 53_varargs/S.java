class S {

     static void pro(String...x) {

         System.out.println("HIIIII");
     }
     

      static void pro(String[] x) {

         System.out.println("Helloooooooooo");
     }

      public static void main(String[] args) {

         pro("om","raju");

      }
     
}

//  S.java:9: error: cannot declare both pro(String[]) and pro(String...) in S
//       static void pro(String[] x) {
//                   ^
// 1 error
