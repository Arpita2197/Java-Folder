class YY {

     YY(int y) {

         System.out.println("HELLO");
     }

     YY() {


     }


}

class V2 extends YY {

                                             // toh ab V2 class ka default constructor V2 sa super call hua jo parameterized nhe tha,
                                              // lekin YY ma ek non-parameterized constructor tha toh supaer() call usko ho gaya...

                                               // o/p ==> A
                                                         // B
    public static void main(String[] args) {

         System.out.println("A");

         V2 x = new V2();

         System.out.println("B");
    }


}