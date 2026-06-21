class Y1 {

}

class AA extends Y1 { }

class BB extends Y1 { }

class CC extends Y1 {  }

class B {

    public static void main(String[] args) {

         Y1 x = new Y1();   // parent class

         Y1 a = new AA();
         Y1 b = new BB();
         Y1 c = new CC();

            System.out.println("!!!!!!!!!!!!!!!!!!");

          //  Y1 d = new Object();  // error ==> parent ko child ma assign nhe kar sakta.....

        System.out.println(a);
         System.out.println(b);
         System.out.println(c);
    }
}