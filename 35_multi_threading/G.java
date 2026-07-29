class CThread extends Thread {

     public void run() {

        Thread a = Thread.currentThread();

         for(int i =0 ; i<30; i++) {

             System.out.println(i  + "--run()--" + a.getName());
         }
     }
}

class G {

     public static void main(String[] args) {

         CThread x = new CThread();

         x.setName("rahu");

         x.start();
         x.start();

         Thread a = Thread.currentThread();

            for(int i =0 ; i<30; i++) {

             System.out.println(i  + "--main()--" + a.getName());
         }
     }
}

//  Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:802)
//         at G.main(G.java:23)