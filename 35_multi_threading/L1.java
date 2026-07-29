class YourRunnable implements Runnable {

     public void run() {

        Thread a = Thread.currentThread();

         for(int  i =0 ; i<30; i++) {

             System.out.println(i + "--run()--" + a.getName());
         }
     }
}

class L1 {

     public static void main(String[] args) {

         YourRunnable r = new YourRunnable();

         Thread t = new Thread(r, "ketu");

        //   t.setName("ketu");

          t.start();

          Thread a = Thread.currentThread();

             for(int  i =0 ; i<30; i++) {

             System.out.println(i + "--main()--" + a.getName());
         }

     }
}