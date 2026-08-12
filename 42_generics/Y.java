import java.util.ArrayList;

class Y {

     public static void main(String [] args) {

         ArrayList<Integer> a = new ArrayList<>();

         a.add(15);
         a.add(29);

         ArrayList <Float> b = new ArrayList <> ();

         b.add(15.29f);
         b.add(29.15f);

         pro(a);
         pro(b);
     }


       static void pro(ArrayList< ? extends Number> list) {
      
            // problem no. 1
           for(Object next : list) {


           }
         
        // problem no 2. Don't add any record...
        // list.add(12);
        // list.add(12.45);

       }
}