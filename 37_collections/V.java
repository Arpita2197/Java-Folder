import java.util.ArrayList;

class V {

     public static void main(String[] args) {

         ArrayList <Student> x = new ArrayList <Student> ();

         Student a = new Student("jay" , 23);
         Student b = new Student("raghav" , 18);
         Student c = new Student("golu" , 9);
         Student d = new Student("vikram" , 12);
         Student e = new Student("om" , 17);

           x.add(a);
           x.add(b);
           x.add(c); 
           x.add(d);
           x.add(e);

            System.out.println(x);


            

     }
}