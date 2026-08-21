class F {
                       //varargs....//ellipses....

    static void mno(int... x) {

        System.out.println("YUMMYYYYYy");
        
         }

           public static void main(String[] args) {

            F.mno();
            F.mno(15,29);
            F.mno(11,12,13);
            F.mno(10,9,8,7);

            int[] arr = {15,29};

            F.mno(arr);
    }

}
