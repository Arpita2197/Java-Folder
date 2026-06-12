class E {

     int y=11;

      public static void main(String[] args) {

         E1 a = new E1();     // HAS-A  instiation access

         System.out.println(a.y);    

          E b = new E();
          System.out.println(b.y);  

      }
}

class E1 {

     int y=111;
}