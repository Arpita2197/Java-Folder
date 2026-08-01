import java.util.ArrayList;

class W {

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

            System.out.println(x.get(0));
         
             System.out.println(x.remove(0));

                 System.out.println(x); 

     }
}