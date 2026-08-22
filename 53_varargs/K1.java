class K1 {

    static void pro(String x , int...y) {
         
         System.out.println(x);
          System.out.println(y.length);

           for( int next : y) {

              System.out.print(next);
           }
       
    }

      public static void main(String[] args) {

            byte a = 10;
            short s = 12;
            char c = 65;

            long l = 1000;
            float f = 12.4f;
            double d = 15.29;

            // int y1 = 12l;
            // int y2 = 12.9f;
            // int y3 = 12.22;


            pro("om",a,s,c,2,l);

      }
 }

//  K1.java:26: error: method pro in class K1 cannot be applied to given types;
//             pro("om",a,s,c,2,l);
//             ^
//   required: String,int[]
//   found:    String,byte,short,char,int,long
//   reason: varargs mismatch; possible lossy conversion from long to int
// 1 error
