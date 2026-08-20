enum CCC {

     A,B,C;

     class Y {

         void pro() {

             System.out.println("HIIIII");
         }
     }

      static class U {


      }
}

 class Z {

     public static void main(String[] args) {

         CCC.Y z = CCC.C.new Y();

          z.pro();
     }
 }