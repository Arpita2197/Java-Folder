class E {

     int x = 99;

      void pro() {

         System.out.println("Hello!!!!!!!!!!");

      }

       class A {      // instance level member class of D...

         
       }

        public static void main(String[] args) {

             E e = new E();

            System.out.println(e.x);

            e.pro();

            A a = e.new A();      // instance level  member class...

             System.out.println(a);
        }
}