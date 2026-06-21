class F1 {

     public static void main(String[] args) {

         SpiderMan a = new SpiderMan();
         ShaktiMan b = new ShaktiMan();

         inviteForLunch(a);
         inviteForLunch(b);

     }

      static void inviteForLunch( SpiderMan  m ) {

         System.out.println("Food serve");
          System.out.println("Cold drinks");
      }

        static void inviteForLunch( ShaktiMan  m ) {

         System.out.println("Food serve");
          System.out.println("Cold drinks");
      }
}

 // code redundancy................
