class W {

     W () {


     }
}

abstract class AA {

     AA() {


     }
}

enum BB {

     BB() {


     }
}

interface CC {

    //  CC () {


    //  }
}


class G {

     public static void main(String[] args) {

         W a = new W();

          new AA();

          new BB();
     }
}

//   G.java:40: error: AA is abstract; cannot be instantiated
//           new AA();
//           ^
// G.java:42: error: enum types may not be instantiated
//           new BB();
//           ^
// 2 errors
