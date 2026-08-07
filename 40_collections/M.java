import java.util.Collections;
import java.util.ArrayList;

class M {

    public static void main(String[] args) {

         ArrayList <Employee> x = new ArrayList <Employee> ();

           x.add(new Employee("mohan",18));       
           x.add(new Employee("zakir",20));
           x.add(new Employee("farahan",55));
           x.add(new Employee("motu",60));     
           x.add(new Employee("bablu",70));

          System.out.println(x);

          Collections.sort(x);
          
          System.out.println(x);
          
    }
}

 // 1 error