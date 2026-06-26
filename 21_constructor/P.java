class B1 {

     int a = 9;
     static boolean q;

     void aaa() {

        System.out.println("aaa()");
     }

     static void mno() {

          System.out.println("static - mno()");
     }
}

class B2 extends B1 {

    float y =3.4f;
    static short u = 90;

     void  bbb() {

        System.out.println("bbb()");
     }

     static void pqr() {

          System.out.println("static - pqr()");
     }

}

class B3 extends B2 {

     char t = 'W';
     static double e = 15;

      void ccc() {

        System.out.println("ccc()");
     }

     static void abc() {

          System.out.println("static - abc()");
     }
}

class P {

    public static void main(String[] args) {

         B3 x = new B3();

         System.out.println(x.q);
         x.mno();

          System.out.println(x.u);
         x.pqr();

          System.out.println(x.e);
         x.abc();
    }
}