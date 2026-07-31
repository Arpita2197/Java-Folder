import java.util.ArrayList;

class R {

     public static void main(String[] args) {
         
         
         ArrayList <Integer> x = new ArrayList <Integer>();

        x.add(10);  
        x.add(15);
        x.add(100);
        x.add(104);

        
         System.out.println(x);
         
         x.add(4,101);

         System.out.println(x);
         
     }
}