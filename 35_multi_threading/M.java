 class HThread extends Thread {

     public void run() {

         Thread a = Thread.currentThread();

             for(int  i =0 ; i<30; i++) {

             System.out.println(i + "--run()--" + a.getName());
         }
     }
 }

 class M {

     public static void main(String[] args) throws InterruptedException {

         HThread a = new HThread();

         a.setName("golu");
         a.start();

          Thread x = Thread.currentThread();

             for(int  i =0 ; i<30; i++) {
                          // jaisa yeah main() blocked state ma chala gaya...
             
             if(i == 15) {
                // System.out.println(x.isAlive()); 
                 a.join();       // jaha join() ko call karo woh blocked state ma chala jayata ha
             }
              
               System.out.println(i + "--main()--" + x.getName());
         }
     }
 }