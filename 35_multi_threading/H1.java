class D1Thread extends Thread {
 
   public void run() {

     Thread a = Thread.currentThread();

       for(int i=0 ; i<30;i++) {

         System.out.println(i + "--run()--" + a.getName() + "~~" + a.getId());
       }
   }
     
}

class H1 {

     public static void main(String[] args) {

         D1Thread x = new D1Thread();
        // x.setName("pihu");
         
         D1Thread y = new D1Thread();
         //  y.setName("raju");
        
         D1Thread z = new D1Thread();
          // z.setName("bablu");

           x.start();
           y.start();
           z.start();

     }
}