class F {

    public static void main(String[] args) {
           
           @SuppressWarnings("deprecation")
          Integer x = new Integer(15);
          System.out.println(x);
   
    }
}

//  F.java:6: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
//           Integer x = new Integer(15);
//                       ^
// 1 warning

 // @SuppressWarnings() ko warnings remove karna ka liya use karta ha but wrapper class ma issa warnings remove nhe ho rhe ha...




                   
            // @Target({TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE,MODULE})
             // @Retention(SOURCE)
                // public @interface SuppressWarnings 