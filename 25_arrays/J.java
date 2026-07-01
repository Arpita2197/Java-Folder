class J {

    public static void main(String[] args) {

    int[] x = {45, 62, 97, 23, 41, 22, 81, 16};

      int count = 0;

      for(int next : x) {

         if(next % 2 != 0 ) {       // odd

             System.out.println(next);
         }

             else {
              
              count++;
               
               System.out.println("count :" + count);
            
          }
 
             
     }


    }

}
