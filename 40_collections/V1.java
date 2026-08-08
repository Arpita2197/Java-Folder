import java.util.Arrays;

class V1 {

     public static void main (String[] args) {

         User[]  x =  {

             new User("ketak" , 12),            
             new User("mehak" , 2),
             new User("arjun" , 62),
             new User("bablu" , 52),
             new User("munna" , 30),
             new User("golu" , 22),

         };

          for(User next : x)
            System.out.print(next + "  #  ");
            
        Arrays.sort(x);
        
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for(User next : x)
            System.out.print(next + "  #  ");
    }

     
}