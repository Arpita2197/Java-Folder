class Q2 {

     public static void main(String[] args) {

        //   String a = "internationalization";

         String y = "instantiation";

          int index = 0;

          while((index = y.indexOf('i',index)) != -1){

              System.out.println(index++);
          }
     }
}