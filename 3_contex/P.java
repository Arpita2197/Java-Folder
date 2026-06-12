class P {

     static int y=45;

      public static void main (String[] args ) {

           P a = new P();
           a.y=10;                        // a=instance contex,and y=class contex

            P b = new P();
            b.y=100;

             P c = new P();
             c.y=1000;

              a.pro();
              c.pro();
              b.pro();
      }

       void pro() {

         System.out.println(y);

       }
}