class D {

  public static void main(String[] args) {

     char a ='A';
     byte b = 11;
     short c = 229;
     int d = 1000;
     long e = 555L;
     float f = 55.555f;
     double g = 29.0;


      int [] x = {a,b,c,d,e,f,g};         // narrowing conversion = risk = error


      for(int next : x)

       System.out.println(next);

  }
     
}

//  D.java:14: error: incompatible types: possible lossy conversion from long to int
//       int [] x = {a,b,c,d,e,f,g};
//                           ^
// D.java:14: error: incompatible types: possible lossy conversion from float to int
//       int [] x = {a,b,c,d,e,f,g};
//                             ^
// D.java:14: error: incompatible types: possible lossy conversion from double to int
//       int [] x = {a,b,c,d,e,f,g};
//                               ^
// 3 errors
