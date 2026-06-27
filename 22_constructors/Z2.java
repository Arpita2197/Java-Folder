class BB {

     BB(int y) {


     }
}

class Z2 extends BB {

     Z2(){

        super(pro());

        pro();
     }

     static int pro(){

         return 15;
     }
}