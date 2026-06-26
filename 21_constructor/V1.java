class YY {

     YY(int y) {

         System.out.println("HELLO");
     }


}

class V1 extends YY {

     V1() {

        super(2);
     }

    public static void main(String[] args) {

         System.out.println("A");

         V1 x = new V1();

         System.out.println("B");
    }


}