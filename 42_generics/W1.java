import java.util.ArrayList;

class W1 {

    public static void main(String[] args) {

        ArrayList <Integer> a = new ArrayList<>();
        ArrayList <Float> b = new ArrayList <>();

        pro(a);
        pro(b);

    }

     static void pro(ArrayList<Integer> list) {

         // problem no.1...

         for(Object next : list) {


         }

          // problem no. 2 ....

           list.add(25);
          // list.add(15.29);
        }

            static void pro(ArrayList<Float> list) {

         // problem no.1...

         for(Object next : list) {


         }

          // problem no. 2 ....

          // list.add(25);
           list.add(15.29f);
     }
}

//  W1.java:30: error: name clash: pro(ArrayList<Float>) and pro(ArrayList<Integer>) have the same erasure
//             static void pro(ArrayList<Float> list) {
//                         ^
// 1 error
