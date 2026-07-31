import java.util.ArrayList;

class M1 {

    public static void main(String[] args) {

         ArrayList x = new ArrayList();

         x.add("mohan");
         x.add("sohan");
         x.add("tohan");
         x.add("rohan"); 
         x.add("gohan");

          System.out.println(x);

          System.out.println("~~~~~~~~");

          for(int i = 0 ; i<x.size() ; i++) {

             System.out.println(x.get(i).length());  // get() obj return karta ha aur obj ma length() property nhe hoti ha

          }
    }
}

//  M1.java:21: error: cannot find symbol
//              System.out.println(x.get(i).length());  // get() obj return karta ha aur obj ma length() property nhe hoti ha
//                                         ^
//   symbol:   method length()
//   location: class Object
// Note: M1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// 1 error
