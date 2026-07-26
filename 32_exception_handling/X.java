class X {

    public static void main(String[] args) {

         Thread x = new Thread();

         x.setPriority(100);     // priority should be from (1 to 10)
    }
}

// C:\Users\lenovo\Desktop\java\32_exception_handling>java X
// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1149)
//         at X.main(X.java:7)
