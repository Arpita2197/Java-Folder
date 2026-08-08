import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class R {

    public static void main(String[] args) {

         ArrayList <Employee> x = new ArrayList <Employee> ();

           x.add(new Employee("mohan",18));       
           x.add(new Employee("zakir",20));
           x.add(new Employee("farahan",55));
           x.add(new Employee("motu",60));     
           x.add(new Employee("bablu",70));

          System.out.println(x);

            Comparator <Employee> comp = new NameAscSort();
            Collections.sort(x , comp);

                 System.out.println(x);

            Employee emp = new Employee("ketak" , 17);

            System.out.println(Collections.binarySearch(x,comp,emp)) ;   


          
    }
}