class AA {

    void process() {

         System.out.println("HI");
    }
}

class A extends AA {

    void pracess() {

        System.out.println("Helloooo");
    }

     public static void main(String[] args) {

         A x = new A();
          x.process();
     }
}