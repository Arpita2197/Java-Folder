class M {

     float e=5.55f;

     public static void main(String[] args) {

         M x = new M();

         x.pro();
          
           
     }

       void pro() {

         System.out.println(x.e);  // error (x is a local variable)

       }
}

             // error = cannot find symbol x , because  x is a local variable.