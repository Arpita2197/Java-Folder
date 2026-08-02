import java.util.HashSet;

 class L {

      public static void main(String[] args) {

           HashSet <Student> x = new HashSet <Student> ();

            x.add (new Student("ram" , 18));
            x.add (new Student("raju" , 19));
            x.add (new Student("raghu" , 20));
            x.add (new Student("raghav" , 21));
            x.add (new Student("rahu" , 22));

           System.out.println(x);
      
          Student y = new Student("raghav" , 21);         // ref code differ

           System.out.println(x.contains(y));      // false
                   

      }
 }