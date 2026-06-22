class W3 {

     void pro() {

         System.out.println("HIIIIII");
     }
}

class W4 extends W3 {

     void pro() {

         System.out.println("Hlooooooooooooo");
     }
}

class W {

     public static void main(String[] args) {

         W3 a = new W4();
         a.pro();             // DYNAMIC METHOD DISPATCH...........
     }
}