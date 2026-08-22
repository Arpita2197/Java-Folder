class G {
                       //varargs
                       
    static void mno(int... x) {            // here x is a array variable....

        System.out.println(x.length);
        
         }

           public static void main(String[] args) {

            G.mno();
            G.mno(15,29);
            G.mno(11,12,13);
            G.mno(10,9,8,7);

            int[] arr = {15,29,1,2,3,4,5,6,7};

            G.mno(arr);
    }

}