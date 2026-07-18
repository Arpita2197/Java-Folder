class C4 {

     public static void main(String[] args) {


       Byte a = new Byte("1a8");

       System.out.println(a);   

         
     }
}

 
// C:\Users\lenovo\Desktop\java\29_wrapper_classes>java C4
// Exception in thread "main" java.lang.NumberFormatException: For input string: "1a8"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:668)
//         at java.base/java.lang.Byte.parseByte(Byte.java:193)
//         at java.base/java.lang.Byte.<init>(Byte.java:372)
//         at C4.main(C4.java:6)
