class B {

     public static void main(String[] args) {

        System.out.println("Start");

         String x = null;

          System.out.println(x.length());

           System.out.println("End");

     } 
}

//  Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
//         at B.main(B.java:9)
