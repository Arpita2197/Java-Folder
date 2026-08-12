import java.util.ArrayList;

class S1 {

     public static void main(String[] args) {

          pro(info());
     }


     static ArrayList info() {

        ArrayList list = new ArrayList();
       
         list.add("om");
         list.add(true);
         list.add(15.29);

          return list;

     }

      static void pro( ArrayList <Integer> x ) {

         x.add(15);
         x.add(29);
         x.add(11);

          System.out.println(x);
      }
}