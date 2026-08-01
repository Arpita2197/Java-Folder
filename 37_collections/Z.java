import java.util.ArrayList;

class Z {

     public static void main(String[] args) {

         ArrayList <Student2> x = new ArrayList <Student2> ();

         Student2 a = new Student2("jay" , 23);
         Student2 b = new Student2("raghav" , 18);
         Student2 c = new Student2("golu" , 9);
         Student2 d = new Student2("vikram" , 12);
         Student2 e = new Student2("om" , 17);

           x.add(a);
           x.add(b);
           x.add(c); 
           x.add(d);
           x.add(e);

            System.out.println(x);
            
             Student2 y = new Student2("raghav" , 18);        
         
             System.out.println(x.contains(y));

                 System.out.println(x); 

     }
}