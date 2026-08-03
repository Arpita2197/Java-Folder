import java.util.TreeSet;

class Z {

     public static void main(String[] args) {

         TreeSet <User1> x = new TreeSet <User1> ();
           
            // User1 ma name ka basis ma compareTo ho raha ha..

         x.add(new User1("om" ,18));
         x.add(new User1("golu" ,20));
         x.add(new User1("sonu" ,30));
         x.add(new User1("rahul" ,44)); 
         x.add(new User1("krish" ,59));

          System.out.println(x);
     }
}