import java.util.ArrayList;

class I {
      
       @SuppressWarnings("unchecked")
    public static void main(String[] args) {

         ArrayList a = new ArrayList();

         a.add(12);
         a.add(14);

          System.out.println(a);
    }
     
     static void pro() {

          ArrayList x = new ArrayList();     //Note: I.java uses unchecked or unsafe operations.
                                                 //Note: Recompile with -Xlint:unchecked for details.
         x.add(10);
         x.add(11);

          System.out.println(x);
     }
} 
