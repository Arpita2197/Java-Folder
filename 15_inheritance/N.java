class AAA {

     
}

class BBB extends AAA {

     
}


class CCC  extends BBB {


}


class N extends CCC {

     public static void main(String[] args) {

         N x = new N();             // instanceOf IS-A relation check karta hai...


          System.out.println(x instanceof N);
          System.out.println(x instanceof CCC);
          System.out.println(x instanceof BBB);
          System.out.println(x instanceof AAA);
          System.out.println(x instanceof Object);

         
     }
}