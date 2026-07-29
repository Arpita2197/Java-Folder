class DThread extends Thread {
 
   public void run() {

     Thread a = Thread.currentThread();

       for(int i=0 ; i<30;i++) {

         System.out.println(i + "--run()--" + a.getName());
       }
   }
     
}

class H {

     public static void main(String[] args) {

         DThread x = new DThread();
         x.setName("pihu");
         
         DThread y = new DThread();
           y.setName("raju");
        
         DThread z = new DThread();
           z.setName("bablu");

           x.start();
           y.start();
           z.start();

     }
}