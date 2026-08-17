class F {

     int x = 9999;

      void pro() {

         System.out.println("Helloooooooooo");

      }

       class A {      // instance level member class of D...

         
       }
       
        void info() {
       
           System.out.println(x);

         pro();

             A a = new A();
             System.out.println(a);
             
        }

        public static void main(String[] args) {

             F e = new F();
             e.info();

    
        }
}