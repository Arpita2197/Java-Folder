class F {

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
}

//  F.java:9: error: incompatible types: ShaktiMan cannot be converted to SpiderMan
//          inviteForLunch(b);
//                         ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error
