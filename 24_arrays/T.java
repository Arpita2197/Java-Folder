class T {

    public static void main(String[] args) {

        int[] x = {10,20,30,40,50};

        int y[]= new int[x.length];  // x ka recrds ko y ma rakhna ha...

         for(int i=0;i<x.length;i++) {

             y[i] = x[i];
         }

          for ( int next : y) {

             System.out.println(next);
          }
     
 }

}