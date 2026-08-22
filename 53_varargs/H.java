class H {
                       //varargs
                       
    static void mno(int... x) {            // here x is a array variable....

        System.out.println(x.length);

          for( int next : x) {

             System.out.println(next);
          }

             System.out.println("\n~~~~~~~~~~");
        
         }

           public static void main(String[] args) {

            H.mno();
            H.mno(15,29);
            H.mno(11,12,13);
            H.mno(10,9,8,7);

            int[] arr = {15,29,1,2,3,4,5,6,7};

            H.mno(arr);
    }

}