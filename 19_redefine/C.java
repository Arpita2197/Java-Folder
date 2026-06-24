class Z1 {

     void pro() {

         System.out.println("Hello!!!!");

     }
}

class Z2 extends Z1 {

        void pro() {

         System.out.println("HI");               // Dynamic method Dispatch.....in instance method only.......
     }

}

class C {

     public static void main (String[] args) {

          Z1 w = new Z2();

           w.pro();
     }
}