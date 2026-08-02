import java.util.HashSet;

class H {


     public static void main(String[] args) {

         HashSet <String> x = new HashSet<String> ();
        
          x.add("kamal");
          x.add("mukesh");
          x.add("raju");
          x.add("sonu");

          System.out.println(x); 

            for(int i = 0 ; i<size() ; i++) {

                 System.out.println(x.get(i));       // HashSet index based nhe ha toh index dena ma error aa rhe ha
            }

               System.out.println(x);  
         
                                      
          
     }
}

//  H.java:17: error: cannot find symbol
//             for(int i = 0 ; i<size() ; i++) {
//                               ^
//   symbol:   method size()
//   location: class H
// H.java:19: error: cannot find symbol
//                  System.out.println(x.get(i));
//                                      ^
//   symbol:   method get(int)
//   location: variable x of type HashSet<String>
// 2 errors
