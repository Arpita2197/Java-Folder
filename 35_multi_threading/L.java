class MyRunnable implements Runnable {

    public void run() {

        Thread x = Thread.currentThread();

        for(int i=0; i<30;i++) {

            System.out.println(i + "--run()--" + x.getName());
        }
    }
}

class L {

    public static void main(String[] args) {

        MyRunnable a = new MyRunnable();

        Thread t = new Thread(a);

        t.setName("golu");
        t.start();


          Thread x = Thread.currentThread();

          for(int i=0; i<30;i++) {

            System.out.println(i + "--main()--" + x.getName());
        }
    }
}