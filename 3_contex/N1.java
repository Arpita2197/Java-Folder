class N1{

     float e = 6.66f;
     

        public static void main (String[] args) {

             N1 x = new N1();

              x.pro(x);
        }

          void pro (N1 q) {

             System.out.println(q.e);
          
          }
     
   
     
     }