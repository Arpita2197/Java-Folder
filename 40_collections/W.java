import java.util.Arrays;
import java.util.Comparator;

class W {

     public static void main (String[] args) {

         Employee[]  x =  {

             new Employee("ketak" , 12),            
             new Employee("mehak" , 2),
             new Employee("arjun" , 62),
             new Employee("bablu" , 52),
             new Employee("munna" , 30),
             new Employee("golu" , 22),

         };

          for(Employee next : x)
            System.out.print(next + "  #  ");

          //    Comparator comp = new AgeDscSort();
            
        Arrays.sort(x , new  AgeDscSortt() );
        
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for(Employee next : x)
            System.out.print(next + "  #  ");
    }

     
}