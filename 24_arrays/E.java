class E {

      public static void main (String[] args) {

         int[] x = new int[11];

          System.out.println(x.length);

           x.length=3;

          System.out.println(x.length);
            
      }
}

//  E.java:11: error: cannot assign a value to final variable length
//            x.length=3;
//             ^
// 1 error
