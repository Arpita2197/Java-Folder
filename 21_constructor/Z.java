class Z1 {

     Z1(int y) {


     }
}

class Z extends Z1 {

     static int q = 15; // static toh sabsa phela frame ma aa jayata ha super() call ka bhi phela....

     Z() {

         super(q);
     }         
}