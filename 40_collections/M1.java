import java.util.Collections;
import java.util.ArrayList;

class M1 {

    public static void main(String[] args) {

         ArrayList <User> x = new ArrayList <User> ();

           x.add(new User("mohan",18));       
           x.add(new User("zakir",20));
           x.add(new User("farahan",55));
           x.add(new User("motu",60));     
           x.add(new User("bablu",70));

          System.out.println(x);

          Collections.sort(x);
          
          System.out.println(x);
          
    }
}