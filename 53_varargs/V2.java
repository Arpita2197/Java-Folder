class V2 {

     static void pro(String[]...x) {
          
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