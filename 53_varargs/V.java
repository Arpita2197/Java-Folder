class V {

     static void pro(String...x) {

         System.out.println("HIIIII");
     }
    
      public static void main(String[] args) {
             
        String[][] y = {{"mohan","om"},{"sonu","monu","dinesh"}};

         pro(y);

      }
     
}  

//  V.java:12: error: method pro in class V cannot be applied to given types;
//          pro(y);
//          ^
//   required: String[]
//   found:    String[][]
//   reason: varargs mismatch; String[][] cannot be converted to String
// 1 error
