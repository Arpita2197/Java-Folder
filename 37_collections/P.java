import java.util.ArrayList;

class P {

     public static void main(String[] args) {

         ArrayList <Integer> x = new ArrayList <Integer>();

        x.add(10);  
        x.add(15);
        x.add(100);
        x.add(104);

         System.out.println(x);

         x.add(2,1000);               // List class ka add() ha
                               // Dynamically work ho raha ha

           System.out.println(x);
        
     }
}