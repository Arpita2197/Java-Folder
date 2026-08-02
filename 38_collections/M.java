import java.util.HashSet;

 class M {

      public static void main(String[] args) {

           HashSet <Student1> x = new HashSet <Student1> ();

            x.add (new Student1("ram" , 18));
            x.add (new Student1("raju" , 19));
            x.add (new Student1("raghu" , 20));
            x.add (new Student1("raghav" , 21));
            x.add (new Student1("rahu" , 22));

           System.out.println(x);
      
          Student1 y = new Student1("raghav" , 21);        

           System.out.println(x.contains(y));     
                   

      }
 }