import java.util.ArrayList;

class R {
  
    public static void main (String[] args) {
         
          // new code
        ArrayList <Integer> x = new ArrayList <> ();

         x.add(15);
         x.add(29);
         x.add(11);

         pro(x);      //------------ funvtion call
        
                      // mixing old and new code......
    }
        
         // old code.....
     static void pro(ArrayList list) {            // ArrayList list = x ;

         System.out.println(list);

         list.add("om");
         list.add(true);
         list.add(15.29);

         System.out.println(list);
     }
}