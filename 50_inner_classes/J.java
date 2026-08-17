class J {
     
     int z = 1000;

      void pro() {

         System.out.println("HYYYYYYYYYYYY");

      }

       class XX {

           void info() {
     
              System.out.println("Namaskarrrrrrr");

              pro();
              
           }
       }

        public static void main(String[] args) {

             J j = new J();

             XX y = j.new XX();

             y.info();
        }
}