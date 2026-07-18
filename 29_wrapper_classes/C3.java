class C3 {

     public static void main(String[] args) {


       Byte a = new Byte("128");

       System.out.println(a);   

         
     }
}

//   Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10
//         at java.base/java.lang.Byte.parseByte(Byte.java:195)
//         at java.base/java.lang.Byte.<init>(Byte.java:372)
//         at C3.main(C3.java:6)


//   RUN - TIME EXCETION....