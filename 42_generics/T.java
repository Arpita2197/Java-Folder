import java.util.ArrayList;

class T {

    public static void main(String[] args) {

         ArrayList y = pro();

         y.add("ram");
         y.add(true);

         System.out.println(y);



    }

     static ArrayList /*<Integer> */ pro() {

         ArrayList <Integer> x = new ArrayList <> ();

         x.add(15);
         x.add(29);
       //  x.add("15");

         return x;
     }
}