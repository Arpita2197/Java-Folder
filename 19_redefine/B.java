class Y1 {

     static int a = 10;

}

class Y2 extends Y1 {

     static int a = 29;

}

class B {

     public static void main(String[] args) {

         Y1 z = new Y2();

          System.out.println(z.a);   // static ha aur something sa call ho raha toh (z.a) ki jagah  (Y1.a)....
     }
}