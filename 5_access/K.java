class student {              // HAS-A ACCESS

     public static void main(String[] args) {

        pen x = new pen();
       x.write();

         
     }
}

class pen {

      void write() {

         System.out.println("write()");
     }
}