class W {

    public static void main(String[] args) {

         Thread x = new Thread();

         x.start();
         x.start();
    }
}

//  Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:802)
//         at W.main(W.java:8)



 // java.lang.Object
//     java.lang.Throwable
//         java.lang.Exception
//             java.lang.RuntimeException
//                 java.lang.IllegalArgumentException
//                     java.lang.IllegalThreadStateException