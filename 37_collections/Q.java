import java.util.ArrayList;

class Q {

     public static void main(String[] args) {

         ArrayList <Integer> x = new ArrayList <Integer>();

        x.add(10);  
        x.add(15);
        x.add(100);
        x.add(104);
        x.add(104);

         System.out.println(x);

        // set = replace

    
         Integer y = x.set(2,999);   // Integer wrapper class ha aur wrapper class ma obj store hota ha
         
        System.out.println(x);             // List class ka set() ha

         System.out.println(y);
     
     }
}