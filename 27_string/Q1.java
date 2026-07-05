class Q1 {

     public static void main(String[] args) {

        //   String a = "internationalization";

         String y = "instantiation";

          int index = y.indexOf('i');

           while( index != -1) {

               System.out.println(index++);
               index = y.indexOf('i',index);
           }
     }
}