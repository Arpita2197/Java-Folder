class G {

     int x=99;   // instance var

      public static void main ( String[] args) {     // class contex

          System.out.println(x);   

      }
}
       // Instance member cannot be referenenced from a class contex

        // error: non-static variable x cannot be referenced from a static context
        //   system.out.println(x);