import java.util.ArrayList;

class Y {

     public static void main(String[] args) {

         ArrayList <Student1> x = new ArrayList <Student1> ();

         Student1 a = new Student1("jay" , 23);
         Student1 b = new Student1("raghav" , 18);
         Student1 c = new Student1("golu" , 9);
         Student1 d = new Student1("vikram" , 12);
         Student1 e = new Student1("om" , 17);

           x.add(a);
           x.add(b);
           x.add(c); 
           x.add(d);
           x.add(e);

            System.out.println(x);
            
             Student1 y = new Student1("raghav" , 18);        // ref code dono raghav obj ka alag ha
         
             System.out.println(x.remove(y));

                 System.out.println(x); 

     }
}