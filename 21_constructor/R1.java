class R1 {

     static int count = 0;

     R1() {

         count++;
     }

     public static void main(String[] args) {

         R1 a = new R1();
         System.out.println(a.count);
         R1 b = new R1();
         System.out.println(b.count);
         R1 c = new R1();
         System.out.println(c.count);
         R1 d = new R1();      
         System.out.println(d.count);
     }
}