class U {

      public static void main(String[] args) {

       int [] x = {10,20,30,40,50};

        int [] y = new int[x.length];

         for(int i=0;i<y.length;i++) {

             y[i] = x[x.length-1-i];
         }

           for( int next : y) {

             System.out.println(next);

         }



  }

}