import java.util.ArrayList;

class M3 {

    public static void main(String[] args) {

         ArrayList <String> x = new ArrayList <String>();

         x.add("mohan");
         x.add("sohan");
         x.add("tohan");
         x.add("rohan"); 
         x.add("gohan");

          System.out.println(x);

          System.out.println("~~~~~~~~");

          for(int i = 0 ; i<x.size() ; i++) {

              System.out.println(x.get(i).length());    // x typesafely use hua ha usko pata ha string record ha toh length() call ho jayaga
        

          }
    }
}