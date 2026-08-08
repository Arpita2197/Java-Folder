import java.util.Arrays;

class V {

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
            
        Arrays.sort(x);
        
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for(Employee next : x)
            System.out.print(next + "  #  ");
    }

     
}

//  ketak--12  #  mehak--2  #  arjun--62  #  bablu--52  #  munna--30  #  golu--22  #  Exception in thread "main" java.lang.ClassCastException: class Employee cannot be cast to class java.lang.Comparable (Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
//         at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
//         at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
//         at java.base/java.util.Arrays.sort(Arrays.java:1041)
//         at V.main(V.java:21)