class W1 {
    void pro() {
        System.out.println("Hello Ji");
    }
}

class W2 extends W1 {

     void info() {

         System.out.println("Namaskar JIi");
     }
}

class V1 {

    public static void main(String[] args) {

         W2 a = new W2();
          a.info();

          W1 b = new W1();
           b.pro();

           W1 c = new W2();
            c.pro();                
    }
}