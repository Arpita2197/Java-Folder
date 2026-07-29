class C {

 public static void main(String[] args) {

     Thread a = Thread.currentThread();

      System.out.println(a + "--main()--" + a.getId());
                                                               // phela main() poora chala phir calling hui aaa() ko....
      aaa();
 }

  static void aaa() {

        Thread a = Thread.currentThread();

      System.out.println(a + "--AAA()--" + a.getId());

       bbb();
  }

      static void bbb() {

        Thread a = Thread.currentThread();

      System.out.println(a + "--BBB()--" + a.getId());

       ccc();
  }

      static void ccc() {

        Thread a = Thread.currentThread();

      System.out.println(a + "--CCC()--" + a.getId());

     
  }
   
     
}