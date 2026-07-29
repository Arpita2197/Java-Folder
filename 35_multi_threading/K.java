class GThread extends Thread {

     public void run() {

         Thread a = Thread.currentThread();

          for(int i = 0;i<30;i++) {

             System.out.println(i + "--run()--" + a.getName());
             
          }
         
     }
}

class K {

     public static void main(String[] args) throws InterruptedException {

         GThread a = new GThread();
         a.setName("Madhu");

         GThread b = new GThread();
         b.setName("kaithab");

         a.start();
         b.start();

          Thread x = Thread.currentThread();

           a.sleep(5000);       // call kha sa kiya main() sa toh main sleep  ma jayaga
           

            for(int i = 0;i<30;i++) {

             System.out.println(i + "--main()--" + x.getName());
          }

        

     }
}