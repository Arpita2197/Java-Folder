class Z1 {

    static void pro() {

         System.out.println("Hello^^^^^");

     }
}

class Z2 extends Z1 {

      static void pro() {

         System.out.println("HI~~~~~~");     // DYNAMIC METHOD DISPATCH SIRF NON - STATIC METHOD MA HOTA HA....

     }

}

class D {

     public static void main (String[] args) {

          Z1 u = new Z2();

           u.pro();
     }
}