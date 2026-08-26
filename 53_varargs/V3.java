class V3 {

     static void pro(String...[] x) {
          
          for(String[] next : x){
             for(String nx : next)

             System.out.println(nx);
          }
         System.out.println("HIIIII");
     }
    
      public static void main(String[] args) {
             
        String[][] y = {{"mohan","om"},{"sonu","monu","dinesh"}};

         pro(y);

      }
     
} 

//  V3.java:3: error: <identifier> expected
//      static void pro(String...[] x) {
//                               ^
// V3.java:3: error: ',', ')', or '[' expected
//      static void pro(String...[] x) {
//                                 ^
// 2 errors