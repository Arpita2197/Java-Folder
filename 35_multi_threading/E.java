class AThread extends Thread {

     public void run() {

        Thread a = Thread.currentThread();

         for(int i =0 ; i<30; i++) {

             System.out.println(i  + "--run()--" + a.getName());
         }
     }                                     // jab khud ka thread bana toh woh runnable sa running ma ayaga thoda time baad jab tak main() thoda chal jayaga
}                                           // jab khud ka thread banayanga toh main() aur khudka wala sath ma chalaga
                                            
                                         

class E {

     public static void main(String[] args) {

         AThread x = new AThread();
         x.setName("golu");
         x.start();

         Thread a = Thread.currentThread();

             for(int i =0 ; i<30; i++) {

             System.out.println(i  + "--main()--" + a.getName());
         }

     }
}