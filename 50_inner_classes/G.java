class AA {

     int x = 555;

      void pro() {

         System.out.println("Namaskar....");

      }

       class A {


       }
}

 class G {

     public static void main(String[] args) {

         AA y = new AA();

          System.out.println(y.x);
          y.pro();

          // A a = y.new A();

           AA.A a = y.new A();    // agar kisi dusari class ki inner class ko access karna ha toh phela outer class likho and then inner class..
             System.out.println(a);
     }
 }