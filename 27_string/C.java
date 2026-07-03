class C {

     public static void main (String[] args) {

         String a = "Ab *^#$@\N_98\u0041";

          System.out.println(a);
     }
}

//  C.java:5: error: illegal escape character
//          String a = "Ab *^#$@\N_98\u0041";
//                               ^
// 1 error