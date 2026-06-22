class X1 {

    void pro() {

         System.out.println("pro()");
    }
}

class B extends X1 {
 
     // overloaded methods in class B: pro()(inherited) and pro(int)(self) ..
    void pro(int x) {

        System.out.println("pro(int)");

    }

    public static void main(String[] args) {

        B y = new B();

        y.pro();
        y.pro(15);
       
    }
}