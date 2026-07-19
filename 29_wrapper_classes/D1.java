class D1 {

     public static void main(String[] args) {

         Double a = new Double("3.5a4");

         System.out.println(a);

     }
}


 
// C:\Users\lenovo\Desktop\java\29_wrapper_classes>java D1
// Exception in thread "main" java.lang.NumberFormatException: For input string: "3.5a4"
//         at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
//         at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
//         at java.base/java.lang.Double.parseDouble(Double.java:651)
//         at java.base/java.lang.Double.<init>(Double.java:733)
//         at D1.main(D1.java:5)


 //   RUN - TIME EXCETION....