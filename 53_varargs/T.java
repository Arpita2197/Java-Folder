class T {

     static void pro(int...x) {

         System.out.println("HIIIII");
     }
     

      static void pro(Integer... x) {

         System.out.println("Helloooooooooo");
     }

      public static void main(String[] args) {

         pro(15,29);

      }
     
}       // ambigous suitation means ==> pro(15,29) dono ma convert ho sakta hai (int and Integer) mai....

//  T.java:16: error: reference to pro is ambiguous
//          pro(15,29);
//          ^
//   both method pro(int...) in T and method pro(Integer...) in T match
// 1 error

