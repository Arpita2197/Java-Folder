class EThread extends Thread {

     public void run() {

         Thread a = Thread.currentThread();

         for(int i = 0 ; i<100;i++) {

             System.out.println(i + "--run()--" + a.getName());
         }
     }
}

class I {

     public static void main(String[] args) {

         EThread x = new EThread();

        x.setName("aman");
         x.start();

          Thread a = Thread.currentThread();

           for(int i = 0 ; i<30;i++) {

              if(i==15) {

                 try {
                     Thread.sleep(1000);                      // jaha sleep call karoga woh sleep ma jayaga
                     
                 } catch(InterruptedException e) {
                    e.printStackTrace();
                 }
              }

               System.out.println(i + "~~main()~~" + a.getName());
           }
     }
}