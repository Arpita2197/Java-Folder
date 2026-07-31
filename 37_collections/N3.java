import java.util.ArrayList;

class N3 {

    public static void main(String[] args) {

         ArrayList <String> x = new ArrayList <String>();        

        x.add("mohan");
        x.add("vidyut");
        x.add("vikramaditya");
        x.add("vishwambhar");
        x.add("virendravikram");

          System.out.println(x);

          System.out.println("~~~~~~~~");

           for(String a : x) {           // x = typesafely use hua ha
            
            System.out.println(a.length());
       
           }

            
          }
    
}