class A {

   static void pro() {

         System.out.println("HIII");
    }
}

class B extends A {

    static void pro() {

         System.out.println("HYYYYYYYYY");
     }

}


class Z2 {
                                                  // DYNAMIC METHOD DISPATCH ==> static ma  nhe hota (agar method ststic hha toh).
      public static void main(String[] args) {

         A x = new B();

          x.pro();
     }
}

 // o/p ==> Hiiii