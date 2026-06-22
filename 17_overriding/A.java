class X1 {

          // METHOD OVERRIDING.....
     void pro() {

        System.out.println("helooo");
     }
}

class A extends X1 {

    void pro() {
                                                //DYNAMIC METHOD DISPATCH.....
        System.out.println("Namaskar");
    }

    public static void main(String[] args) {

         A x = new A();

         x.pro();
         x.pro();
    }
}