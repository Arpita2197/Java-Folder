class AA {

     AA(int y) {

     }
}

class Z1 extends AA {

     Z1() {

         super(pro());   // pro() instance level ha aur woh chaning ka baad ayaga ,phela super call run ho jayaga..

         pro();
     }

     int pro(){

         return 12;
     }
}

//  Z1.java:12: error: cannot reference this before supertype constructor has been called
//          super(pro());
//                ^
// 1 error
