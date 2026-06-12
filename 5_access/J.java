class J  extends J1 {                //IS-A ACCESS

     public static void main(String[] args) {

          J x = new J();
          x.info();

     }
}


class J1 {

     void info () {

         System.out.println("Hello");
     }
}